class Solution {
    /*public List<List<String>> solveNQueens(int n) {

        //Approach-1 time-->O(N!*N)  space-->O(N2)
        String board[][]=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=".";
            }
        }
        List<List<String>> ans=new ArrayList<>();
        SolveNQueens(0,ans,new ArrayList<>(),n,board);
        return ans;
        
    }
    static void SolveNQueens(int col,List<List<String>> ans,List<String>temp,int n,String board[][]){
        if(col==n){
           List<String>t = new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];

                }
                t.add(str);
            }
            if(!ans.contains(t)){
                ans.add(new ArrayList<>(t));

            }
            return;
        }
        //Placing queen cloumnwise first in 1st column then in 2nd and next 3rd,4th
        
        for(int row=0;row<n;row++){
           if(NoHarm(row,col,n,board)){
                board[row][col]="Q";
                SolveNQueens(col+1,ans,temp,n,board);
                board[row][col]=".";
            }
        }
    }
    static boolean NoHarm(int row,int col,int n,String board[][]){
        //Upper diagonal
        int dirow=row;
        int dicol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=="Q"){
                return false;
            }
            row--;
            col--;
        }
        //left
        row=dirow;
        col=dicol;
        while(col>=0){
            if(board[row][col]=="Q"){
                return false;
            }
            col--;
        }
        //lower diagonal
        row=dirow;
        col=dicol;
        while(col>=0 && row<n){
            if(board[row][col]=="Q"){
                return false;
            }
            col--;
            row++;
        }
        return true;
    }*/

    //Approach-2 (Hasing method)
    public List<List<String>> solveNQueens(int n) {

        //Approach-1 time-->O(N!*N)  space-->O(N)
        String board[][]=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=".";
            }
        }
        List<List<String>> ans=new ArrayList<>();
        boolean rowcheck[]=new boolean[n];
        boolean upperdiag[]=new boolean[2*n-1];
        boolean lowerdiag[]=new boolean[2*n-1];
        SolveNQueens(0,ans,new ArrayList<>(),n,board,rowcheck,upperdiag,lowerdiag);
        return ans;
        
    }
    static void SolveNQueens(int col,List<List<String>> ans,List<String>temp,int n,String board[][],boolean rowcheck[],boolean upperdiag[],boolean lowerdiag[]){
        if(col==n){
           List<String>t = new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];

                }
                t.add(str);
            }
            if(!ans.contains(t)){
                ans.add(new ArrayList<>(t));

            }
            return;
        }
        for(int row=0;row<n;row++){
            if(rowcheck[row]==false && lowerdiag[row+col]==false && upperdiag[(n-1)+col-row]==false){
                board[row][col]="Q";
                rowcheck[row]=true;
                lowerdiag[row+col]=true;
                upperdiag[(n-1)+col-row]=true;
                SolveNQueens(col+1,ans,temp,n,board,rowcheck,upperdiag,lowerdiag);
                board[row][col]=".";
                rowcheck[row]=false;
                lowerdiag[row+col]=false;
                upperdiag[(n-1)+col-row]=false;
            }
        }
    }
}