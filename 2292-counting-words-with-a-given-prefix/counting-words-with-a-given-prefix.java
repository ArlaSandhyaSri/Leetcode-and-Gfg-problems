class Solution {
    public int prefixCount(String[] words, String pref) {
        int total=0;
        for(int i=0;i<words.length;i++){
            int c=0;
            while(c<pref.length() && c<words[i].length()){
                if(words[i].charAt(c)!=pref.charAt(c)){
                    break;
                }
                else{
                    c++;
                }
            }
            if(c==pref.length()){
                total++;
            }

        }
        return total;
        
    }
}