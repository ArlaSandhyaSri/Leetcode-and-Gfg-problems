class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        //POTD
        int flips_[]=new int[nums.length];
        flips_[0]=0;
        for(int i=1;i<nums.length;i++){
            flips_[i]=flips_[i-1] + (nums[i-1]%2==nums[i]%2?1:0);
        }


        int quer_len=queries.length;
        boolean ans[]=new boolean[quer_len];
        int i=0;
        for(int q[]:queries){
            ans[i++]=flips_[q[1]]-flips_[q[0]]==0;

        }
        return ans;

        
    }
}