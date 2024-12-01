class Solution {
    public int smallestNumber(int n) {
        int i=1;
        while((1<<i)-1<n){
            i++;
        }
        return (1<<i)-1;
    }
}