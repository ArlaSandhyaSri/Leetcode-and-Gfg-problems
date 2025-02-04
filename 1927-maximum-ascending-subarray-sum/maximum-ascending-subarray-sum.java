class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                if(i==n-2){
                    sum+=nums[i+1];
                }
                sum+=nums[i];
                ans=Math.max(ans,sum);
            }
            else{
                sum+=nums[i];
                ans=Math.max(ans,sum);
                sum=0;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
        
    }
}