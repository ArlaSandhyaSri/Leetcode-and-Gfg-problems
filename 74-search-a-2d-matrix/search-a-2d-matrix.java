class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(target==matrix[row][col]){
                return true;
            }
            else if(target<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
       /* int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(target==matrix[i][j]){
                return true;
            }
            else if(target>matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;*/
        
    }
}