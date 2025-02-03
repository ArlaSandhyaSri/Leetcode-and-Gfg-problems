class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int inc=1;
        int dec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                inc++;
            }else{
                inc=1;
            }

            if(nums[i-1]>nums[i]){
                dec++;
            }else{
                dec=1;
            }
            ans=Math.max(ans,Math.max(inc,dec));
        }
        return ans;

        
    }
}