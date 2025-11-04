class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        } 
        for(Map.Entry<Integer,Integer> et:mp.entrySet())    {
            if(et.getValue()>n/2){
                return et.getKey();
            }
        }  
        return -1;
    }
}