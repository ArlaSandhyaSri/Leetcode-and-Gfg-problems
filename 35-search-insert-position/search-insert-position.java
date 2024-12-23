class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int ans=nums.length;
        /*while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;*/
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;

    }
}