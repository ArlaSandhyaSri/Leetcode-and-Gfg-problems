class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(time(mid,piles)<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int time(int mid,int piles[]){
        int t=0;
        for(int i=0;i<piles.length;i++){
            t+=Math.ceil((double)piles[i]/(double)mid);
        }
        return t;
    }
    static int max(int piles[]){
        int maxi=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>maxi){
                maxi=piles[i];
            }
        }
        return maxi;

    }
}
       /* int low=1;
        int high=maximum(piles);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int hours=timetaken(piles,mid);
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int timetaken(int piles[],int k){
        int ans=0;
        for(int i=0;i<piles.length;i++){
            ans+=Math.ceil((double)piles[i]/(double)k);
        }
        return ans;
    }
    static int maximum(int piles[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxi){
                maxi=piles[i];
            }
        }
        return maxi;
    }
}*/