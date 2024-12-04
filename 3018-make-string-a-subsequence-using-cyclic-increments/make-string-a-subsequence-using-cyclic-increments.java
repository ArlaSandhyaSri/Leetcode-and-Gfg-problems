class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();
        int first=0;
        int sec=0;
        while(first<len1 && sec<len2){
            char ch1=str1.charAt(first);
            char ch2=str2.charAt(sec);
            if(ch1==ch2){
                first++;
                sec++;
            }else{
                if(ch1+1==ch2 || ch1-25==ch2){
                    first++;
                    sec++;
                }else{
                    first++;
                }
            }
        }
        return sec==len2;
        
    }
}