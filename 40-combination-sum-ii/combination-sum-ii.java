class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       
       List<List<Integer>> finalans=new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,new ArrayList<>(),finalans);
        return finalans;
    }
    static void combination(int index,int candidates[],int target,ArrayList<Integer> ar,List<List<Integer>>finalans){
        if(target==0){
            finalans.add(new ArrayList<>(ar));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) return;
            ar.add(candidates[i]);
            combination(i+1,candidates,target-candidates[i],ar,finalans);
            ar.remove(ar.size()-1);
        }
    }
}