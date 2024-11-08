class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                maxi=Math.max(count,maxi);
                count=0;
            }
        }
        return Math.max(maxi,count);
        
    }
}