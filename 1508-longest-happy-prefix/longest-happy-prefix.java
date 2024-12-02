class Solution {
    public String longestPrefix(String s) {
       /* Set<String> prefix = new HashSet<>();
        String pre="";
        for(int i=0;i<s.length()-1;i++){
            pre+=s.charAt(i);
            prefix.add(pre);
        }
        Set<String> suffix = new HashSet<>();
        String suf="";
        for(int i=s.length()-1;i>0;i--){
            suf=s.charAt(i)+suf;
            suffix.add(suf);
        }
        int len=Integer.MIN_VALUE;
        String ans="";

        for(String st:prefix){
            if(suffix.contains(st)){
                if(st.length()>len){
                    len=st.length();
                    ans=st;
                }
            }
        }
        return ans;*/

        //KMP Algo

        int n=s.length();
        int lps[]=new int[n];
        lps[0]=0;
        int i=1;
        int len=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0,lps[s.length()-1]);

        
    }
}