class Solution {
    public int singleNumber(int[] nums) {
       /* int n=nums.length;
        int current=0;
        for(int i=0;i<n;i++){
            current=current^nums[i];
        }
        return current;*/
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> it : mp.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
        
    }
}