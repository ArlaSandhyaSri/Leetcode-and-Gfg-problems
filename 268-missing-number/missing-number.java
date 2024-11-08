class Solution {
    public int missingNumber(int[] nums) {
        //Optimal1
        /*int n = nums.length;
        int sum=(n*(n+1))/2;
        int sum_a=0;
        for(int i=0;i<n;i++){
            sum_a=sum_a+nums[i];
        }
        return sum-sum_a;*/

        int XOR_M=0;
        int XOR_S=0;
        for(int i=0;i<nums.length;i++){
            XOR_S^=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            XOR_M^=i;
        }
        return XOR_S^XOR_M;
    }
}