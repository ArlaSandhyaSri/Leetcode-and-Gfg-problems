class Solution {
    public boolean isCircularSentence(String sentence) {
        String ar[]=sentence.split(" ");
        if(ar.length==1){
            int len=ar[0].length();
            if(ar[0].charAt(len-1)==ar[0].charAt(0)){
                return true;
            }
            else{
                return false;
            }
        }
        for(int i=0;i<ar.length-1;i++){
            int len=ar[i].length();
            if(ar[i].charAt(len-1)!=ar[i+1].charAt(0)){
                return false;
            }
        }
        if(sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
            return true;
        }else{
            return false;
        }
        
    }
}