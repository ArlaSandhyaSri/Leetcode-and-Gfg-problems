class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int index[]=new int[2];
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(count==2){
                    return false;
                }
                index[count++]=i;
            }

            
        }
        return s1.charAt(index[0])==s2.charAt(index[1]) && s1.charAt(index[1])==s2.charAt(index[0]);
        
    }
}