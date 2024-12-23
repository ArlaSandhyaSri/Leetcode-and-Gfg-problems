class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                index=i;
                break;
            }
        }
        if(index==-1){
            return "";
        }else{
            return num.substring(0,index+1);
        }

       /* int index=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                index=i;
                break;
            }
        }
        if(index==-1){
            return "";
        }
        else{
            return num.substring(0,index+1);
        }*/
    }
}