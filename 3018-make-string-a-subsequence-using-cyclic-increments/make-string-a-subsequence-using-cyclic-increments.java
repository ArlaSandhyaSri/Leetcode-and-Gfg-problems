class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();
        int sec=0;
        for(int i=0;sec<len2 && i<len1;i++){
            if(str1.charAt(i)==str2.charAt(sec) || str1.charAt(i)+1==str2.charAt(sec) || str1.charAt(i)-25 ==str2.charAt(sec)){
                sec++;
            }

        }
        return sec==len2;
        
    }
}