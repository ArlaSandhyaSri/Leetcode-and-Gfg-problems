class Solution {
    public String largestOddNumber(String num) {
        //if we should not use inbuilt functions like substring and all then main index variable and if found odd store that index and later append from 0 to index.
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}