class Solution {
    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
            if(sum<0){
               // maxi=Math.max(maxi,sum);
                sum=0;
            }

        }
        return maxi;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=nums[i];
        //     maxi=Math.max(sum,maxi);
        //     for(int j=i+1;j<n;j++){
        //         sum+=nums[j];
        //         maxi=Math.max(maxi,sum);
        //     }
        // }
        // return Math.max(maxi,sum);
        
    }
}