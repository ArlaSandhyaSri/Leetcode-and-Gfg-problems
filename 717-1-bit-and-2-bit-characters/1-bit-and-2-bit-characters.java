class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int i=0;
        while(i<n){
            if(i==n-1){
                if(bits[i]==0){
                    return true;
                }

            }
            else if(bits[i]==1){
                if(bits[i+1]==0 || bits[i+1]==1){
                    i=i+2;
                }
            }
            else{
                i++;
            }
            
        }
        return false;

    }
}