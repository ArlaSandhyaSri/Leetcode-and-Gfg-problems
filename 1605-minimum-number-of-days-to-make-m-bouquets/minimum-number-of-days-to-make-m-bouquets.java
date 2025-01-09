class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int low=1;
        int high=max(bloomDay);
        while(low<=high){
            int mid=(low+high)/2;
            if(check(mid,bloomDay,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return low;
    }
    static int max(int bloomDay[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>maxi){
                maxi=bloomDay[i];
            }
        }
        return maxi;
    }
    static boolean check(int mid,int bloomDay[],int m,int k){
        int adjcount=0;
        int boquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                adjcount++;
                if(adjcount==k){
                    boquets++;
                    adjcount=0;
                }
            }else{
                adjcount=0;
            }
        }
        return boquets>=m;
    }
}





       /* if((long)m*k>bloomDay.length){ 
            //used long bcoz if length if long it will throw an aerror if not used long;
            return -1;
        }
        int low=1;
        int high=maxone(bloomDay);
        while(low<=high){
            int mid=(low+high)/2;
            if(countadjflowers(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    static int maxone(int bloomDay[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
        }
        return max;
    }
    static boolean countadjflowers(int bloomDay[],int mid,int m,int k){
        int boquets=0;
        int adjcount=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                adjcount++;
                if(adjcount==k){
                    boquets++;
                    adjcount=0;
                }
            }
            else{
                adjcount=0;
            }
        }
        return boquets>=m;*/