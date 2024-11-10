class Solution {
    public void sortColors(int[] nums) {
        /*int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
            }

        }
        
    }
    static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;*/
      
      //Brute force
        //Arrays.sort(nums);

      // Better --Counting
      int z=0;
      int o=0;
      int t=0;
      int l=0;
      while(l<nums.length){
        if(nums[l]==0){
            z++;
            l++;
        }else if(nums[l]==1){
            o++;
            l++;
        }
        else{
            t++;
            l++;
        }
      }

      for(int i=0;i<z;i++){
        nums[i]=0;
      }
      for(int i=z;i<z+o;i++){
        nums[i]=1;
      }
      for(int i=z+o;i<o+z+t;i++){
        nums[i]=2;
      }

    }
}
