class Solution {
    public String answerString(String word, int numFriends) { 
        int anslen = (word.length()-numFriends)+1;
        if(numFriends==1){
            return word;
        }   
        char maxi='a';
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>maxi){
                maxi=word.charAt(i);
            }
        }
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==maxi){
                list.add(i);
            }
        }
        List<String> temp = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String str=word.substring(list.get(i),Math.min(list.get(i)+anslen,word.length()));
            temp.add(str);
        }

        String ans="a";
        for(int i=0;i<temp.size();i++){
            if(temp.get(i).compareTo(ans)>0){
                ans=temp.get(i);
            }
            else if(temp.get(i).compareTo(ans)==0){
                if(temp.get(i).length()>ans.length()){
                    ans=temp.get(i);
                }
            }
        }
        return ans;



        
        
    }
}