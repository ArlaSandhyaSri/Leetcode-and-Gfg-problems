class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            maxi=Math.max(maxi,weights[i]);
        }
        int st = maxi;
        int end=sum(weights);
        int ans=0;
        while(st<=end){
            int mid=(st+end)/2;

            if(check(weights,days,mid)<=days){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }

        }
        return ans;
        
    }

    static int check(int weights[],int days,int mid){
        int d=0;
        int w=0;
        for(int i:weights){
            if(w+i<=mid){
                w+=i;
            }else{
                d++;
                w=i;
            }
        }
        return d+1;
    }
    static int sum(int weights[]){
        int sum=0;
        for(int i:weights){
            sum+=i;
        }
        return sum;
    }
}