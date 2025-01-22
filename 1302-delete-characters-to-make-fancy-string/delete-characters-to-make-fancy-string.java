class Solution {
    public String makeFancyString(String s) {
        int len=s.length();
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        int count=1;
        for(int i=1;i<len;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                if(count>=3){
                    continue;

                }else{
                    str.append(s.charAt(i));
                }
            }else{
                count=1;
                str.append(s.charAt(i));
            }

        }
        return str.toString();
        
    }
}