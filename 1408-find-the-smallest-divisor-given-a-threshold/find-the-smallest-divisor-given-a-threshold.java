class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int low=1;
        int high=max;
        int fina=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=0;
            for(int i:nums){
                ans+=i%mid==0?i/mid:(i/mid)+1;
            }
            if(ans<=threshold){
                fina=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return fina;
    }
}
        