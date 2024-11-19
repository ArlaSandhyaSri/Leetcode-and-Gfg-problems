class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        Solve(0,s,temp,result);
        return result;
    }
    static void Solve(int index,String s,List<String> temp,List<List<String>>result){
        if(index==s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                Solve(i+1,s,temp,result);
                temp.remove(temp.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}