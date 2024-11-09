class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalans=new ArrayList<>();
        combination(0,target,candidates,new ArrayList<>(),finalans);
        return finalans;
    }
    static void combination(int index,int target,int arr[],ArrayList<Integer> ar,List<List<Integer>>finalans){
        if(index==arr.length){
            if(target==0){
                finalans.add(new ArrayList<>(ar));
            }
            return;
        }
        if(arr[index]<=target){
            ar.add(arr[index]);
            combination(index,target-arr[index],arr,ar,finalans);
            ar.remove(ar.size()-1);
        }combination(index+1,target,arr,ar,finalans);//Not pick condition
    }
}