class Solution {
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return checking(nums,i+1);
                
            }
        }
        return true;
        
    }
    static boolean checking(int arr[],int j){
        for(int i=j;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }


        }
        if(arr[0]<arr[arr.length-1]){
            return false;
        }
        return true;


    }
}