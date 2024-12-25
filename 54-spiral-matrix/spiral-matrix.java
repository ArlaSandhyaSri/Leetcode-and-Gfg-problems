class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        List<Integer> ar = new ArrayList<>();
        int left=0;
        int top=0;
        int bottom=r-1;
        int right=c-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ar.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ar.add(matrix[i][right]);
            }
            right--;
            if(left>right || top>bottom){
                break;
            }
            for(int i=right;i>=left;i--){
                ar.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                ar.add(matrix[i][left]);
            }
            left++;
        }
       /* List<Integer> arr=new ArrayList<>();
        int left=0;
        int top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top>bottom || left>right){
                break;
            }
            for(int i=right;i>=left;i--){
                arr.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr.add(matrix[i][left]);
            }
            left++;

        }
        return arr;*/
        return ar;
        
    }
}