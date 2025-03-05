class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }
        double ans=Math.pow(n,2)+Math.pow((n-1),2);

        return (long)ans;
        
    }
}