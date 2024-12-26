class Solution {
    public void rotate(int[][] matrix) {
        int rows =matrix.length;
        int cols=matrix[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(int i=0;i<rows;i++){
            int c=cols-1;
            for(int j=0;j<cols/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][c];
                matrix[i][c]=temp;
                c--;
            }
        }
        
    }
}