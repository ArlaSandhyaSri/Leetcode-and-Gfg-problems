class Solution {
    public int maxScore(String s) {
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){ones++;}
        }


        int maxi=Integer.MIN_VALUE;
        int zeroCount=0;
        int onesCount=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeroCount++;
              //  maxi=Math.max(maxi,count+ones);
            }
            else{
                onesCount++;
                //maxi=Math.max(maxi,count+ones);
            }
            int currscore=zeroCount+(ones-onesCount);
            maxi=Math.max(maxi,currscore);


        }
        return maxi;
        
    }
}