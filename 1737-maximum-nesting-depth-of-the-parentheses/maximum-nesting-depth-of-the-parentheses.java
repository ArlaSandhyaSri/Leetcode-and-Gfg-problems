class Solution {
    public int maxDepth(String s) {
        //Using stack
       /*Stack<Character> stack=new Stack<>();
        int depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            if(ch==')'){
                depth=Math.max(depth,stack.size());
                stack.pop();
            }
        }
        return depth;*/

        int n=s.length();
        int i=0;
        int count=0;
        int ans =0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                ans=Math.max(ans,count);
                count--;
            }
            i++;
        }
        return ans;

    }
}