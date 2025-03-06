class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=1;i<=grid.length*grid.length;i++){
            if(!mp.containsKey(i)){
                ans[1]=i;
            }else{
                if(mp.get(i)>1){
                    ans[0]=i;
                }
            }
        }
        return ans;
        
    }
}