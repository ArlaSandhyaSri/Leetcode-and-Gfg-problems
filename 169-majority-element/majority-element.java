class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int major=-1;
        /*for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }

        }*/
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> et:mp.entrySet()){
            if(et.getValue()>n/2){
                return et.getKey();
            }
        }

        return -1;
    }
}