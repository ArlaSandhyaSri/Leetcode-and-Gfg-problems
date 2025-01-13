class Solution {
    public int minimumLength(String s) {
        //optimal
        int n = s.length();
        int cnt[] = new int[26];

        int removed = 0;
        for (char ch : s.toCharArray()){
            cnt[ch - 'a']  += 1;
            if (cnt[ch - 'a'] > 2){
                cnt[ch-'a'] -= 2;
                removed += 2;
            }
        }
        return n - removed;
    }
}
/*
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
}*/