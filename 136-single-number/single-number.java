class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> et:mp.entrySet()){
            if(et.getValue()==1){
                return et.getKey();
            }
        }
        return -1;
       /* int xor_=0;
        for(int i=0;i<nums.length;i++){
            xor_^=nums[i];
        }
        return xor_;*/
        
    }
}