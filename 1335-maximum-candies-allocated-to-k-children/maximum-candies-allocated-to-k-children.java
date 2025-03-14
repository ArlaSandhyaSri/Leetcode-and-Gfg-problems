class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
       
        int l=1;
        int r=max;
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(canDistribute(candies,k,mid)){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return ans;
        
    }
    static boolean canDistribute(int candies[],long k,int mid){
        long count=0;
        for(int i=0;i<candies.length;i++){
            count+=(long)candies[i]/mid;
        }
        return count>=k;

    }
}