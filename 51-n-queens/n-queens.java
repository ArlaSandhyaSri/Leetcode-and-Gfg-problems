class Solution {
    public List<List<String>> solveNQueens(int n) {

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
        for(int row=0;row<n;row++){
            if(NoHarm(row,col,n,board)){
                board[row][col]="Q";
                SolveNQueens(col+1,ans,temp,n,board);
                board[row][col]=".";
            }
        }
    }
    static boolean NoHarm(int row,int col,int n,String board[][]){
        int dirow=row;
        int dicol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=="Q"){
                return false;
            }
            row--;
            col--;
        }
        row=dirow;
        col=dicol;
        while(col>=0){
            if(board[row][col]=="Q"){
                return false;
            }
            col--;
        }
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
    }
}