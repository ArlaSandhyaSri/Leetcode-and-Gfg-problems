class Solution {
    public int minStartValue(int[] nums) {
        int pref=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            pref+=nums[i];
            mini=Math.min(mini,pref);
        }

        if(mini>=1){
            return 1;
        }
        return 1-mini;
        
    }
}