class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int pre=1;
        int suff=1;
        for(int i=0;i<n;i++){
            if(pre==0){
                pre=1;
            }
            if(suff==0){
                suff=1;
            }
            pre*=nums[i];
            suff*=nums[n-i-1];
            max=Math.max(max,Math.max(pre,suff));

        }
        return max;
    }
}