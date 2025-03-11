class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int a=0;
        int b=0;
        int c=0;
        int start=0;
        int end=0;
        while(end<s.length()){
            if(s.charAt(end)=='a'){
                a++;
            }
            if(s.charAt(end)=='b'){
                b++;
            }
            if(s.charAt(end)=='c'){
                c++;
            }
            while(a>=1 && b>=1 && c>=1){
                count+=s.length()-end;
                if(s.charAt(start)=='a'){a--;}
                if(s.charAt(start)=='b'){b--;}
                if(s.charAt(start)=='c'){c--;}
                start++;
            }
            end++;

        }
        return count;
        
    }
}