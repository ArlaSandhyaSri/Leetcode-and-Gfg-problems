class Solution {
    public int pivotIndex(int[] nums) {
        int suf=IntStream.of(nums).sum();

        // for(int num:nums){
        //     suf+=num;
        // }
        int pref=0;
        for(int i=0;i<nums.length;i++){
            suf-=nums[i];
            if(pref==suf){
                return i;
            }

            pref+=nums[i];
            

        }
        return -1;
        
    }
}