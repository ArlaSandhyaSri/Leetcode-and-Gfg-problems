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

        //Without using stack

        int depth=0;
        int i=0;
        int temp=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                temp++;
            }
            else if(ch==')'){
                depth=Math.max(depth,temp);
                temp--;
            }
            i++;
        }
        return depth;
    }
}