class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
        
    }
}