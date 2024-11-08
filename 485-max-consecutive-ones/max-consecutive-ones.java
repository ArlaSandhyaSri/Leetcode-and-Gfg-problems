class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //Process-1
        /*int n=nums.length;
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
        return Math.max(maxi,count); */

        //Process-2
        int l=0;
        int r=0;
        int max_count=Integer.MIN_VALUE;
        while(r<nums.length){
            while(r<nums.length && nums[r]==1){
                r++;
            }
            max_count=Math.max(max_count,r-l);
            l=r+1;
            r=r+1;
        }
        return max_count;   
    }
}