class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int count=0;
        int index=0;
        for(int i=0;i<spaces.length;i++){
            while(index<spaces[i]){
                ans.append(s.charAt(index));
                index++;
            }
            ans.append(" ");
        }
        while(index<s.length()){
            ans.append(s.charAt(index));
            index++;
        }
        return ans.toString();
        
    }
}