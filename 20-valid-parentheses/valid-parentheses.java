class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        /*for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(st.size()==0 || st.peek()!='('){
                    return false;
                }else{
                    st.pop();
                }
            }
            else if(s.charAt(i)=='}'){
                if(st.size()==0 || st.peek()!='{'){
                    return false;
                }else{
                    st.pop();
                    
                }
            }
            else if(s.charAt(i)==']'){
                if(st.size()==0 || st.peek()!='['){
                    return false;    
                    
                }else{
                    st.pop();
                   
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;*/
        for(char ch:s.toCharArray()){
            if(ch==')' || ch=='}'||ch==']'){
                if(st.size()==0){
                    return false;
                }
                char el=st.pop();
                if((ch==')' && el!='(') || (ch=='}'&&el!='{') || (ch==']'&&el!='[')){
                    return false;
                }

            }else{
                st.push(ch);
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }
    
}
        