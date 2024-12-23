class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<rows;i++){
            int t=columns-1;
            for(int j=0;j<columns/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][t];
                matrix[i][t]=temp;
                t--;
            }
        }
        
    }
}