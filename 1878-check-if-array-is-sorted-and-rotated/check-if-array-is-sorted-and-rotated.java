class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return checkrotate(nums,i+1);
            }
        }
        return true;
    }
    static boolean checkrotate(int nums[],int index){
        for(int i=index;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        if(nums[nums.length-1]>nums[0]){ // if a array is left rotated then definitely we can say that the array is not arranged in ascending before rotating 
            return false;
        }
        return true;
    }
}