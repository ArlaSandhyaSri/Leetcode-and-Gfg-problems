class Solution {
    public int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int columns = mat[0].length;
        int prim_sum=0;

       /* for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j){
                    prim_sum+=mat[i][j];
                }
            }
        }
        int sec_sum=0;
        int r=0;
        int c=columns-1;
        while(r<rows && c>=0){
            if(r!=c){
                sec_sum+=mat[r][c];
            }
            r++;
            c--;
        }
        return prim_sum+sec_sum;*/
        //Optimal
        int sum=0;
        for (int i = 0; i < rows; i++) {
            sum += mat[i][i];
            if (rows - i - 1 != i) {
                sum += mat[i][rows - i - 1];
            }
        }
        return sum;
        
    }
}