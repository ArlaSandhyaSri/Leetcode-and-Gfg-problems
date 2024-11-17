class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isOK(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)){
                                return true;
                            }
                            board[i][j]='.';
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isOK(char board[][],int row,int col,char c){
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
        for(int i=0;i<9;i++){
            if(board[row][i]==c){
                return false;
            }
            if(board[i][col]==c){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
        return true;

    }

}