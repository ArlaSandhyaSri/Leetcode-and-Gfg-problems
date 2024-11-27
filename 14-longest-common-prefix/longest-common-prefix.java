class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common=strs[0];
        for(String st:strs){
            while(st.length()<common.length() || (!common.equals(st.substring(0,common.length())))){
                common=common.substring(0,common.length()-1);
            }
        }
        return common;
        
    }
}