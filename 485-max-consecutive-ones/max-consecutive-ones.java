class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*int n =nums.length;
        int count=0;
        int max_count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }else{
                max_count=Math.max(count,max_count);
                count=0;
            }
        }
        return Math.max(max_count,count);*/
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