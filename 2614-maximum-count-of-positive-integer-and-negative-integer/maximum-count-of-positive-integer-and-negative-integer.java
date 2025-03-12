class Solution {
    public int maximumCount(int[] nums) {
        int c_pos=0;
        int c_neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                c_neg++;
            }else if(nums[i]>0){
                c_pos++;
            }
        }
        return Math.max(c_neg,c_pos);
        
    }
}