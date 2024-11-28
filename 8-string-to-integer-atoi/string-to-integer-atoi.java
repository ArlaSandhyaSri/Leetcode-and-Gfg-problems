class Solution {
    public int myAtoi(String s) {
        /*int i=0;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }else if(i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        long ans=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            ans=ans*10+(s.charAt(i)-'0');
            if(ans*sign<Integer.MIN_VALUE){return Integer.MIN_VALUE;}
            else if(ans*sign>Integer.MAX_VALUE){return Integer.MAX_VALUE;}
            i++;
        }
        return (int)ans*sign;*/
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