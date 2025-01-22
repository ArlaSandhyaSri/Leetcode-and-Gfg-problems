class Solution {
    public String compressedString(String word) {
        int len=word.length();
        StringBuilder st = new StringBuilder();
        
        int c=1;
        for(int i=0;i<len;i++){
            char ch = word.charAt(i);
            c=1;
            while(i<len-1 && ch==word.charAt(i+1) && c<9){
                c++;
                i++;
            }
            st.append(c);
            st.append(word.charAt(i));
            
            
        }
        return st.toString();
        
    }
}