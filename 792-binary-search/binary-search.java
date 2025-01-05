class Solution {
    public int search(int[] nums, int target) {
        /*int start=0;
        int high=nums.length-1;
        while(start<=high){
            int mid=(start+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;*/

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        

        
    }
}