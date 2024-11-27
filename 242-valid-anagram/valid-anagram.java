class Solution {
    public boolean isAnagram(String s, String t) {
        /*if(s.length() !=t.length()){
            return false;
        }

        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                mp.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(mp.containsKey(t.charAt(i))){
                mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))!=0){
                return false;
            }
        }
        return true;*/
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                mp.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(mp.containsKey(t.charAt(i))){
                mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))!=0){
                return false;
            }
        }
        return true;

        
    }
}