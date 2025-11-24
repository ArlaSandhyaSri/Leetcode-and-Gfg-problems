class Solution {
    public int mySqrt(int x) {
        long ans=-1;

        long st=1;
        long end = x;
        if(x==0){
            return 0;
        }
        while(st<=end){
            long mid=(st+end)/2;
            if((long)mid*mid<=x){
                ans=mid;
                st=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return (int) ans;
        
    }
}