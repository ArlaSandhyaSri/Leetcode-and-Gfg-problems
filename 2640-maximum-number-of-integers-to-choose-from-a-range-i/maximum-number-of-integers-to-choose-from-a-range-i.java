class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<banned.length;i++){
            hs.add(banned[i]);
        }
        int max_sum=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                if(max_sum+i<=maxSum){
                    count++;
                    max_sum+=i;
                }
                else{
                    break;
                }
            }
        }
        return count;
        
    }
}