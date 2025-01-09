class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maximum=0;
        int sum=0;
        for(int i:weights){
            maximum=Math.max(maximum,i);
            sum+=i;
        }
        int low=maximum;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int count=1;
            int tot_sum=0;
            for(int i:weights){
                if(tot_sum+i<=mid){
                    tot_sum+=i;
                }else{
                    count++;
                    tot_sum=i;
                }
            }
            if(count<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}