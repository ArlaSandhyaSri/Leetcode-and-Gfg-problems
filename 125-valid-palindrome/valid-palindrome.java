class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                str.append(ch);
            }
        }
        return check(str.toString(),0,str.length()-1);
    }
    static boolean check(String s,int l,int r){
        if(s.isEmpty() || l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return check(s,l+1,r-1);

    
        
        /*String b = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) { 
                b += Character.toLowerCase(s.charAt(i));
            }
        }
        

		    	
		    
               //System.out.println(b);   
        int left = 0;
        int right = b.length() - 1;
        while (left < right) {
            if (b.charAt(left) != b.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}*/
   /*    if(s.length()==0){
            return true;
        }
        s=s.toLowerCase();
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(!alpha(s.charAt(i))){
                i++;
            }
            else if(!alpha(s.charAt(j))){
                j--;
            }
            else if(s.charAt(i)!=s.charAt(j)){
                return false;
                // without using to lower case we can use (s.charAt(l) - 'A') % 32 != (s.charAt(r) - 'A') % 32)
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean alpha(char c){
        if(c<='9' && c>='0'){
            return true;
        }
        if(c>='a'&&c<='z'){
            return true;
        }
       /* if(c>='A'&&c<='Z'){
            return true;
        }
        return false;*/
    }
}
