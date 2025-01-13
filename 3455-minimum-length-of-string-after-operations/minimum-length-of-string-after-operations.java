class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2){
            return s.length();
        }
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> en:mp.entrySet()){
            int val=en.getValue();
            while(en.getValue()>=3){
                val-=2;
                mp.put(en.getKey(),val);
            }
        }
        int ans=0;
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            ans+=e.getValue();
        }
        return ans;
        
    }
}