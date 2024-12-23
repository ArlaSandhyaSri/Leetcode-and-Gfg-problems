class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*int maxi=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                maxi=Math.max(maxi,count);
                count=0;
            }
            else{
                count++;
            }
        }
        return Math.max(maxi,count);*/
        

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