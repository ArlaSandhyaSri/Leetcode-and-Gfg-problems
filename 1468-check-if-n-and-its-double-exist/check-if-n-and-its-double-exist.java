class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(2*arr[i])){
                return true;
            }
            if(arr[i]%2==0){
                if(mp.containsKey(arr[i]/2)){
                    return true;
                }
            }
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        return false;
    }
}
       