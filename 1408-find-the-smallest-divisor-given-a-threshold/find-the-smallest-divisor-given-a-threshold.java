class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int st = 1;
        int end = maxi(nums);
        int an=Integer.MIN_VALUE;;
        while(st<=end){
            int mid=(st+end)/2;
            int ans=0;
            for(int i:nums){
                ans+=i%mid==0?i/mid: (i/mid)+1;
            }
            if(ans<=threshold){
                an=mid;
                end=mid-1;

            }else{
                st=mid+1;
            }
        }
        return an;


    }




    static int maxi(int nums[]){
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
}