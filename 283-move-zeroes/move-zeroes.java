class Solution {
    public void moveZeroes(int[] nums) {
        int z_index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z_index=i;
                break;
            }
        }
        if(z_index==-1){
            return;
        }
        for(int j=z_index+1;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[z_index];
                nums[z_index]=temp;
                z_index++;
            }

        }
        
    }
}