class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int current=0;
        for(int i=0;i<n;i++){
            current=current^nums[i];
        }
        return current;
        
    }
}