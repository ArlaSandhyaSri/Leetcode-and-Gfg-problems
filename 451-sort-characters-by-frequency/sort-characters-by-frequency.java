class Solution {
    public String frequencySort(String s) {
       /* StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        while(!mp.isEmpty()){
            int max=0;
            char repchar='a';
            for(Map.Entry<Character,Integer> m : mp.entrySet()){
                if(m.getValue()>max){
                    repchar=m.getKey();
                    max=m.getValue();
                }
            }
            for(int i=0;i<max;i++){
                sb.append(repchar);
            }
            mp.remove(repchar);


        }
        return sb.toString();*/
        StringBuilder word = new StringBuilder();

        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        while(!mp.isEmpty()){
            int maxi=Integer.MIN_VALUE;
            char mostrep='a';
            for(Map.Entry<Character,Integer> m : mp.entrySet()){
                if(m.getValue()>maxi){
                    mostrep=m.getKey();
                    maxi=m.getValue();
                }
            }
            for(int i=0;i<maxi;i++){
                word.append(mostrep);
            }
            mp.remove(mostrep);
        }
        return word.toString();
    }
}