class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        if (s.isEmpty()) {
            return 0; // Handle empty string
        }
        return atoi(s, 0, 1, 0);
    }

    static int atoi(String s, int index, int sign, int result) {
        if (index >= s.length()) {
            return result * sign; // Base case: End of string
        }

        char ch = s.charAt(index);

        // Handle sign at the first character
        if (index == 0 && (ch == '+' || ch == '-')) {
            sign = (ch == '-') ? -1 : 1;
            return atoi(s, index + 1, sign, result);
        }

        // Process digits
        if (Character.isDigit(ch)) {
            int digit = ch - '0';

            // Boundary checks
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            return atoi(s, index + 1, sign, result);
        }

        // Stop processing at the first non-digit character
        return result * sign;
    
    
       /* int n=s.length();
        int index=0;
        while(index<s.length()&&s.charAt(index)==' '){
            index++;
        }
        int sign=1;
        if(index<s.length() && s.charAt(index)=='+' ){
            index++;
        }else if(index<s.length() && s.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        long res=0;
        while(index<s.length() && Character.isDigit(s.charAt(index))){
            res=res*10+(s.charAt(index)-'0');
            if(sign*res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sign*res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int)res*sign;*/
      

       
    }
}