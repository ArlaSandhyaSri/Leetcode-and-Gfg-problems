class Solution {
    public boolean canConstruct(String s, int k) {
        int count=0;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> m:mp.entrySet()){
            if(m.getValue()%2!=0){
                count++;
            }
        }
        return count<=k && k<=s.length();
        
    }
}