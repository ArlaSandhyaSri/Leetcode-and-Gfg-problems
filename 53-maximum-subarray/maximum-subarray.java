class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
       /* for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxi=Math.max(maxi,sum);
            }
        
        }
        return maxi;*/
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
        }
        return Math.max(maxi,sum);
        
    }
}