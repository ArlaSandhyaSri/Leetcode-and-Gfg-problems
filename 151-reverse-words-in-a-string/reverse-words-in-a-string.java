class Solution {
    public String reverseWords(String s) {
        String temp="";
        String ans="";
        /*for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch==' '){
                if(temp!=""){
                    if(ans==""){
                        ans=temp;
                    }else{
                        ans=temp+' '+ans;
                    }
                    temp="";
                }
            }
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans=temp+' '+ans;
            }
            else{
                ans=temp;
            }
        }
        return ans;*/
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