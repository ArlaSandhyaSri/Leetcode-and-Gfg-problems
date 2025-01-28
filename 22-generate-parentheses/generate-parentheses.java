class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solve(n,n,"",list);
        return list;
    }
    static void solve(int open,int close,String str,List<String>list){
        if(open==0 && close==0){
            list.add(str);
            return;
        }
        if(open>0){
            solve(open-1,close,str+"(",list);
        }
        if(close>open){
            solve(open,close-1,str+")",list);
        }
    }
   
}