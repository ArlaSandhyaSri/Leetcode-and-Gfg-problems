class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int count=0;
        long total=0;
        long cursum=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int i=0;i<n-1;i++){
            cursum+=nums[i];
            if(cursum>=total-cursum){
                count++;
            }
        }
        return count;
       
    }
}