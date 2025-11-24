class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int val=0;

        for(int i=0;i<nums.length;i++){
            val=((val*2)+nums[i])%5;

            ans.add(val==0);
        }
        return ans;
    }
}
