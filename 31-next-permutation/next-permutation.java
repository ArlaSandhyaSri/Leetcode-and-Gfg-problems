class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index1=-1;
        int index2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index1=i;
                break;
            } 
        }
        if(index1==-1){
            reverse(nums,0);
            
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[index1]<nums[i]){
                    index2=i;
                    break;
                }
            }
            swap(nums,index1,index2);
            reverse(nums,index1+1);
        }

    }
    static void swap(int nums[],int index1,int index2){
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    static void reverse(int nums[],int index){
        int n=nums.length;
        int i=index;
        int high=n-1;
        while(i<high){
            int temp=nums[i];
            nums[i]=nums[high];
            nums[high]=temp;
            i++;
            high--;

        }
    }
}