class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int first=-1;
        int last=-1;

        /*while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]>target){
                h=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                int indexl=mid;
                int indexh=mid;
                while(indexl>=0 && nums[indexl]==target){
                    first=indexl;
                    indexl--;
                }
                while(indexh<=nums.length-1 && nums[indexh]==target){
                    last=indexh;
                    indexh++;
                }
                break;
            }

        }
        return new int[]{first,last};*/
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