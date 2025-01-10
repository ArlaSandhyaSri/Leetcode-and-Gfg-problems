class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int a[]=new int[26];
        for(String word:words2){
            int temp[]=count(word);
            for(int i=0;i<26;i++){
                a[i]=Math.max(a[i],temp[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        for(String word:words1){
            boolean an=true;
            int b[]=count(word);
            for(int i=0;i<26;i++){
                if(b[i]<a[i]){
                    an=false;

                }
            }
            if(an){
                ans.add(word);
            }
        }
        return ans;

        
    }
    static int[] count(String word){
        int ar[]=new int[26];
        for(int i=0;i<word.length();i++){
            ar[word.charAt(i)-'a']++;
        }
        return ar;
    }
}