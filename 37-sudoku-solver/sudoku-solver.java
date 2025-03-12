class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    static boolean solve(char board[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isOK(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isOK(char board[][],int row,int col,char c){
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c || board[i][col] == c) return false; // Check row and column
        }
        int startRow = (row / 3) * 3; // Determine the starting row of the 3x3 box
        int startCol = (col / 3) * 3; // Determine the starting column of the 3x3 box
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == c) return false; // Check the 3x3 box
            }
        }
        return true;
    }
        //This way of using 3 for loops is not much efficient..so we had another way by using only 1 loop
        //Complte row checking
        /*for(int i=0;i<9;i++){
            if(board[row][i]==c){
                return false;
            }
        }
        //Complete column checking
        for(int i=0;i<9;i++){
            if(board[i][col]==c){
                return false;
            }
        }

        //Checking particular submatrix
        for(int i=(row/3)*3;i<((row/3)*3)+3;i++){
            for(int j=(col/3)*3;j<((col/3)*3)+3;j++){
                if(board[i][j]==c){
                    return false;
                }
            }
        }*/
       /* for(int i=0;i<9;i++){
            if(board[row][i]==c){
                return false;
            }
            if(board[i][col]==c){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }*/
}