class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]= new int[s.length()];
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== c){
                arr.add(i);
            }
        }

        int index=0;
        int j=Integer.MAX_VALUE;
        int i=arr.get(index);

        for(int k=0;k<s.length();k++){
            if(k>i && index<arr.size()-1){
                index++;
                j=arr.get(index-1);
                i=arr.get(index);
            }
            ans[k]=Math.min(Math.abs(i-k),Math.abs(j-k));
            
        }
        return ans;
        
    }
}