class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans[]={-1,-1};
        int start =0;
        int end = n-1;
        
        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                int starti=mid;
                int endi=mid;
                while(starti>=0 && nums[starti]==target){
                    ans[0]=starti;
                    starti--;
                }
                while(endi<=nums.length-1 && nums[endi]==target){
                    ans[1]=endi;
                    endi++;
                }

                break;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return ans;
        
    }
}