class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mid%2==1){ //every second repeated number will be at odd index if all the before elements are repeated twice so we are checking if single element present before this or after this mid;
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                start=mid+2;
            }
            else{
                end=mid;
            }
        }
        return nums[start];
        
    }
}