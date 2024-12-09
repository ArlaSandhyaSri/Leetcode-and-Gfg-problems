class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int first=-1;
        int last=-1;

        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                int startindex=mid;
                int endindex=mid;
                while(startindex>=0 && nums[startindex]==target){
                    first=startindex;
                    startindex--;
                }
                while(endindex<nums.length && nums[endindex]==target){
                    last=endindex;
                    endindex++;
                }
                break;
            }
        }
        return new int[]{first,last};
    }
}