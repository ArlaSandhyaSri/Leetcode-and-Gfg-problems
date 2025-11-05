class Solution {
    public void setZeroes(int[][] matrix) {

        int r= matrix.length;
        int c= matrix[0].length;

        int rows[]=new int[r];
        int cols[]=new int[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rows[i]=-1;
                    cols[j]=-1;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rows[i]==-1||cols[j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

        // int r=matrix.length;
        // int c=matrix[0].length;

        // boolean rows[]=new boolean[r];
        // boolean cols[]=new boolean[c];

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(matrix[i][j]==0){
        //             rows[i]=true;
        //             cols[j]=true;
        //         }
        //     }
        // }

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(rows[i]|| cols[j]){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }

        
    }
}