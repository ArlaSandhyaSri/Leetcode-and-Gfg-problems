class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()!=2){
            StringBuilder st=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int a=(s.charAt(i)-'0' + s.charAt(i+1)-'0')%10;
                st.append(a);
            }
            s=st.toString();
        }
        if(s.charAt(0)==s.charAt(1)){
            return true;
        }
        return false;
    
        
    }
}