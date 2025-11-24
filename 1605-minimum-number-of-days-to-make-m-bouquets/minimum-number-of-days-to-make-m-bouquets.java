class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int ans=-1;
        int st=1;
        int end=maxi(bloomDay);
        while(st<=end){
            int mid=(st+end)/2;
            if(check(bloomDay,m,k,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;   
    }

    static boolean check(int bloomDay[],int m,int k,int mid){

        int adjCount=0;
        int boq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                adjCount++;
                if(adjCount==k){
                    boq++;
                    adjCount=0;
                }
                
            }else{
                adjCount=0;

            }
        }
        return boq>=m;


    }
    static int maxi(int bloomDay[]){
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<bloomDay.length;i++){
            ans=Math.max(ans,bloomDay[i]);
        }
        return ans;
    }
}