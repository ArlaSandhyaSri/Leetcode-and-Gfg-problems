class Solution {
    public int romanToInt(String s) {

        /*int result=0;
        for(int i=0;i<s.length();i++){
            int s1=value(s.charAt(i));
            if(i+1<s.length()){
                int s2=value(s.charAt(i+1));
                if(s1>=s2){
                    result=result+s1;
                }else{
                    result=result+s2-s1;
                    i++;

                }
            }else{
                result=result+s1;
            }
        }
        return result;
    }
    int value(char a){
        if(a=='I'){
            return 1;
        }if(a=='V'){
            return 5;
        }if(a=='X'){
            return 10;
        }if(a=='L'){
            return 50;
        }if(a=='C'){
            return 100;
        }if(a=='D'){
            return 500;
        }if(a=='M'){
            return 1000;
        }
        return -1;*/
        int result=0;

        for(int i=0;i<s.length();i++){
            int ch1 = value(s.charAt(i));

            if(i+1<s.length()){
                int ch2 = value(s.charAt(i+1));
                if(ch1>=ch2){
                    result=result+ch1;
                }
                else if(ch1<ch2){
                    result=result+ch2-ch1;
                    i++;
                }
            }
            else{
                result+=ch1;
            }
        }
        return result;
    }
    int value(char c){
        switch(c) {
            case 'X': return 10;
            case 'I': return 1;
            case 'V':return 5;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default : return -1;
        }
    }
}