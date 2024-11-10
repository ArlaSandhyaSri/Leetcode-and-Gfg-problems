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

      /*int z=0;
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
      }*/
      
      //Using Dutch National Flag Algo - optimal

     /* In this 0---low-1 -----> 0
      low----mid-1 ------->1
      mid--high ---- > random values //now sorting this part
      high+1-----n-1 ----->2*/

      int low=0;
      int mid=0;
      int high=nums.length-1;

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
            swap(nums,mid,high);
            high--; //here in above low 0 case we know that till low it is solved and till mid also solved so we can the that swapped one will be 1, but here we dont know that where number in high is 1 or not so should not increment mid;
        }
      }

    }
    static void swap(int nums[],int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;

    }
}
