class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        int st=1;
        int end = maxi;

        int ans=-1;

        while(st<=end){
            int mid=(st+end)/2;
            if(Cal(mid,piles)<=h){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
        
    }
    static int Cal(int number,int piles[]){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=Math.ceil((double)piles[i]/(double)number);
        }
        return time;

    }
}