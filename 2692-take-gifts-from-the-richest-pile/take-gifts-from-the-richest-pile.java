class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        for(int i=0;i<k;i++){
            Arrays.sort(gifts);
            gifts[n-1] = (int)Math.floor(Math.sqrt(gifts[n-1]));
        }
        long sum=0;
        for(int e: gifts){
            sum+=e;
        }
        return sum;
    }
}