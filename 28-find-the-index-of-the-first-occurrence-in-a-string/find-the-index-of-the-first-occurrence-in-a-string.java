class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return -1;
        }if(needle.length()>haystack.length()){
            return -1;
        }
        for(int i=0;i<=(haystack.length()-needle.length());i++){
            int first=i;
            int end=0;
            while(end<needle.length()){
                if(haystack.charAt(first)==needle.charAt(end)){
                    first++;
                    end++;
                }
                else{
                    break;
                }
            }
            if(end==needle.length()){
                return i;
            }
        }
        return -1;
        
    }
}