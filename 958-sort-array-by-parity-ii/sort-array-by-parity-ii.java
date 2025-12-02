class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;
        int k=1;
        for(int j=0;j<nums.length;j++){
            if( i<nums.length && nums[j]%2==0){
                ans[i]=nums[j];
                i+=2;
            }
            else{
                ans[k]=nums[j];
                k+=2;
            }
        }
        return ans;
        
    }
}