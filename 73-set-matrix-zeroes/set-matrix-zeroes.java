class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int columns = matrix[0].length;
        int ro[]=new int[rows];
        int col[]=new int[columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]==0){
                    ro[i]=-1;
                    col[j]=-1;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(ro[i]==-1||col[j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}