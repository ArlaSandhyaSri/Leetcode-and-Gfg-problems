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

        //Using KMP
       /* int n=haystack.length();

        int m=needle.length();
        int lps[]=new int[m];
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<m){
            if(needle.charAt(i)==needle.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }

        int j=0;
        int k=0;
        while(j<haystack.length()){
            if(haystack.charAt(j)==needle.charAt(k)){
                j++;
                k++;
                if(k==needle.length()){
                    return j-k;
                }
            }else{
                if(k!=0){
                    k=lps[k-1];
                }
                else{
                    j++;
                }
            }

        }
        return -1;*/

        
    }
}