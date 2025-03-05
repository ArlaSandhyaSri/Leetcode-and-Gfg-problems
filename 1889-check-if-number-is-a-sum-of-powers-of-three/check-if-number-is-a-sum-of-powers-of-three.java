class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i=16;i>=0;i--){
            int power=(int)Math.pow(3,i);
            if(n>=power){
                n-=power;
            }

        }
        return n==0;
        
    }
}