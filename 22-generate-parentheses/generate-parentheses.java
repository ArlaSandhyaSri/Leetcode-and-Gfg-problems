class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        String output="";
        solve(0,0,n,"",list);
        return list;
    }
    static void solve(int open,int close,int n,String str,List<String>list){
        if(open==n && close==n){
            list.add(str);
            return;
        }
        if(open<n){
            solve(open+1,close,n,str+"(",list);
        }
        if(open>close){
            solve(open,close+1,n,str+")",list);
        }
    }
   
}