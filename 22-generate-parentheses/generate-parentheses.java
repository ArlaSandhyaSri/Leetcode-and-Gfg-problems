class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        String output="";
        solve(0,0,n,"",list);
        return list;
       /* int openb=0,closeb=0;
        String output="";
        
        List<String> list = new ArrayList<>();
        solve(0,0,list,"",n);
        return list;*/
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
    /*static void solve(int openb,int closeb,List<String>list,String output,int n){
        if(openb==n && closeb==n){
            list.add(output);
            return;
        }
        if(openb<n){
            solve(openb+1,closeb,list,output+"(",n);
        }
        if(openb>closeb){
            solve(openb,closeb+1,list,output+")",n);
        }
    }*/
}