class Solution {
    public int minChanges(String s) {
        int change=0;
        for(int i=0;i<s.length();i+=2){
            char ch=s.charAt(i);
            if(s.charAt(i+1)!=ch){
                change++;
            }
        }
        return change;
        
    }
}