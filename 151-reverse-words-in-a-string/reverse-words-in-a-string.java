class Solution {
    public String reverseWords(String s) {
       /* String words[]=s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

        
       /* String words[]=s.trim().split("\\s+"); //this trims starting and ending spaces and \\s+ checks for extra spaces in between and ecludes them also
        StringBuilder ans=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            ans.append(words[i]);
            if(i!=0){ //if i!=0 means except after last word we will give space
                ans.append(" ");
            }
        }
        return ans.toString();*/


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