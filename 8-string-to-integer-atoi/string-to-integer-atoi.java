class Solution {
    public int myAtoi(String s) {
        int index=0;
        while(index<s.length() && s.charAt(index)==' '){
            index++;
        }
        int sign=1;
        if(index<s.length() && s.charAt(index)=='+'){
            index++;
        }
        else if(index<s.length() && s.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        long result=0;
        while(index<s.length() && Character.isDigit(s.charAt(index))){
            result=result*10+(s.charAt(index)-'0');
            if(sign*result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            else if(sign*result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            index++;
        }
        return (int)result*sign;

        
    }
}