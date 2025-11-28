class Solution {
    public int splitArray(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(count(mid,nums,k)>k){
                low=mid+1;
            }
            else{
                ans=Math.min(ans,mid);
                high=mid-1;
            }
        }
        return ans;
        
    }
    static int count(int mid,int nums[],int k){
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else{
                count++;
                sum=nums[i];
            }

        }
        return count;
    }
}