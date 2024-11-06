class Solution {
    public int maxSubArray(int[] nums) {
        //Better Approach 
        /*int max_sum=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                max_sum=Math.max(max_sum,sum);
            }
        }
        return max_sum;*/
        //Optimal approach
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;

    }
}