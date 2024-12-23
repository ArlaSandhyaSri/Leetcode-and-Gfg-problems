class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
        //BruteForce
       /* int n=nums.length;
        for(int i=1;i<=k;i++){
            rotateright(nums,n);
        }
    }
    static void rotateright(int nums[],int n){
        int right=nums[n-1];
        for(int i=n-2;i>=0;i--){
            nums[i+1]=nums[i];
        }
        nums[0]=right;
    }*/

        /*int n=nums.length;
        k=k%n;                // useful when k>=n
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
    static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }*/
}