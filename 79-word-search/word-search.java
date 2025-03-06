class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int columns=board[0].length;
        int index=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(board[i][j]==word.charAt(0)){
                    if(searchcomplete(board,word,0,i,j,rows,columns)){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
    static boolean searchcomplete(char board[][],String word,int index,int m,int n,int rows,int columns){
        char c=' ';
         if(index==word.length()){
            return true;
        }
        if(m<0 || n<0 || m==rows || n==columns||board[m][n]!=word.charAt(index)){
            return false;
        }
        c = board[m][n];
        board[m][n]=' ';

        boolean topdirection = searchcomplete(board,word,index+1,m-1,n,rows,columns);
        boolean bottomdirection=searchcomplete(board,word,index+1,m+1,n,rows,columns);
        boolean leftdirection=searchcomplete(board,word,index+1,m,n-1,rows,columns);
        boolean rightdirection = searchcomplete(board,word,index+1,m,n+1,rows,columns);

        board[m][n]=c;

        return topdirection || bottomdirection || leftdirection || rightdirection;
    }
}