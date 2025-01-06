class Solution {
    //public boolean searchMatrix(int[][] matrix,int target){
       /* int m=matrix.length;
        int n=matrix[0].length;

        int l=0;
        int r=n-1;
        while(l<m && r>=0){
            if(matrix[l][r]==target){
                return true;
            }else if(matrix[l][r]<target){
                l++;

            }else{
                r--;

            }
        }
        return false;
        
    }*/
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            int l=0;
            int r=matrix[i].length-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]<target){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return false;
    }
}