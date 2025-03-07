class Solution {
    public int[] closestPrimes(int left, int right) {
        int ans[]={-1,-1};
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)){
                ar.add(i);
            }
        }
        int minGap=Integer.MAX_VALUE;
        for(int i=1;i<ar.size();i++){
            minGap=Math.min(minGap,ar.get(i)-ar.get(i-1));
        }
        for(int i=0;i<ar.size()-1;i++){
            if(ar.get(i)+minGap==ar.get(i+1)){
                ans[0]=ar.get(i);
                ans[1]=ar.get(i+1);
                break;
            }
        }
        return ans;
        /*int ans[]={-1,-1};
        int minGap=Integer.MAX_VALUE;
        int prev=-1;
        for(int i=left;i<=right;i++){
            if(check(i)){
                if(prev!=-1){
                    int gap=i-prev;
                    if(gap<minGap){
                        minGap=gap;
                        ans[0]=prev;
                        ans[1]=i;
                    }
                }
                prev=i;
                

            }
        }
        return ans;*/
        
    }
    static boolean check(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){return false;}
        }
        return true;
    }
}