class Solution {
    public int singleNumber(int[] nums) {
        int xor_=0;
        for(int i=0;i<nums.length;i++){
            xor_^=nums[i];
        }
        return xor_;
        
    }
}