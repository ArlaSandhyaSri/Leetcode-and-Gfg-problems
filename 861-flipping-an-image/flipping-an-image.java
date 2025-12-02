class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows=image.length;
        int cols = image[0].length;

        int r=0;
        while(r<rows){
            int st=0;
            int end = cols-1;
            while(st<=end){
                int temp;
                if(image[r][st]==0){
                    temp=1;
                }
                else{
                    temp=0;
                }
                
                if(image[r][end]==0){
                    image[r][st]=1;
                }
                else{
                    image[r][st]=0;
                }

                image[r][end]=temp;
                st++;
                end--;

            }

            r++;
        } 
        return image; 
        
    }
}