class Solution {
    public String removeOuterParentheses(String s) {
       /* StringBuilder sb = new StringBuilder();
        int countofParanthesis=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(countofParanthesis>0){ //if count>0 then it is not an outer paranthesis
                    sb.append(ch);
                }
                countofParanthesis++;
            }
            else{
                countofParanthesis--;
                if(countofParanthesis>0){  //Even after decrementing count>0 then it is not closing of outer paranthesis.
                    sb.append(ch);
                }
            }
        }
        return sb.toString();*/
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count!=0){
                    sb.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count!=0){
                    sb.append(ch);
                }

            }
        }
        return sb.toString();
    }
}