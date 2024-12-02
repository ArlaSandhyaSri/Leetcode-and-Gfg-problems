class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int start=0;
        int end=0;
        int len=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
            int even=expand(i,i+1,s);
            int odd=expand(i,i,s);
            len=Math.max(even,odd);
            if(len>end-start){
                start=i-((len-1)/2);
                end=i+(len/2);
            }
        }
        return s.substring(start,end+1);
        
    }
    static int expand(int left,int right,String s){
        if(s.length()==0 || left>right){
            return 0;
        }
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;

    }
}



        //TLE O(N3)
        /*String ans="";
        int len=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            StringBuilder str=new StringBuilder();
            for(int j=i;j<s.length();j++){
                str.append(s.charAt(j));
                if(checkPalindrome(str.toString())){
                    if(str.length()>len){
                        len=str.length();
                        ans=str.toString();
                    }
                }

            }
        }
        return ans;
        
    }
    static boolean checkPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;*/