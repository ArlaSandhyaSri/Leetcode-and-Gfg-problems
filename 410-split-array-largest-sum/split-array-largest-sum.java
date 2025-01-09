class Solution {
    public int splitArray(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(nums[i],low);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int splitcount=calculate(nums,mid);
            if(splitcount>k){ // if subarrays greater than k then subarray should  be increased
                low=mid+1;
            }else{
                ans=Math.min(ans,mid);     
// else decrease the length of subarray or if count==k then should seek  for minimum sum on left part.
                high=mid-1;
            }

        }
        return ans;
        
    }
    static int calculate(int nums[],int mid){
        int noofsub=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else{
                noofsub++;
                sum=nums[i];
            }
        }
        return noofsub;
    }
}