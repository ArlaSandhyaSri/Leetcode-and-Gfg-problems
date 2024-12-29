class Solution {
    public String frequencySort(String s) {
        StringBuilder str = new StringBuilder();
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        while(!mp.isEmpty()){
              int maximum=Integer.MIN_VALUE;
              char mostrep='a';
              for(Map.Entry<Character,Integer> ent:mp.entrySet()){
                if(ent.getValue()>maximum){
                    maximum=ent.getValue();
                    mostrep=ent.getKey();
                }
              }
              for(int i=0;i<maximum;i++){
                str.append(mostrep);
              }
            mp.remove(mostrep);
        }
        return str.toString();
    }
}

