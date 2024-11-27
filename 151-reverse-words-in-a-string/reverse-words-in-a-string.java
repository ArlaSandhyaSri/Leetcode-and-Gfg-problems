class Solution {
    public String reverseWords(String s) {
        String temp="";
        String ans="";
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char ch=s.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch==' '){
                if(!temp.equals("")){
                    if(!ans.equals("")){
                        ans=temp+' '+ans;
                    }
                
                    else{
                        ans=temp;
                    }
                }
                temp="";
            }
            left++;
        }

        if(!temp.equals("")){
            if(ans.equals("")){
                ans=temp;
            }else{
                ans=temp+' '+ans;
            }
        }
        return ans;
    }
}