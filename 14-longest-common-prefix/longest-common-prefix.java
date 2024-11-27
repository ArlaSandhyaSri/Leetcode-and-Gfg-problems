class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*String commonpref=strs[0];
        for(String current : strs){
            while(current.length()<commonpref.length() || (!commonpref.equals(current.substring(0,commonpref.length())))){
                commonpref=commonpref.substring(0,commonpref.length()-1);
            }
        }
        return commonpref;*/
        String common=strs[0];
        for(String st:strs){
            while(st.length()<common.length() || (!common.equals(st.substring(0,common.length())))){
                common=common.substring(0,common.length()-1);
            }
        }
        return common;
        
    }
}