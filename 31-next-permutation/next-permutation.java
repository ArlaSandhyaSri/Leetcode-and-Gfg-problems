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
            reverse(nums,0,n);
        }else{
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[index1]){
                    index2=i;
                    break;
                }
            }
            swap(nums,index1,index2);
            reverse(nums,index1+1,n);
        }
    }
    static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reverse(int nums[],int i,int n){
        int l=i;
        int h=n-1;
        while(l<h){
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }


        /*int n=nums.length;
        int index1=-1;
        int index2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index1=i;
                break;
            }
        }
        if(index1==-1){
            reverse(nums,0,n);  //// if no next possible exit then return first which is reverse of this
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[index1]){
                    index2=i;
                    break;
                }
            }
            swap(nums,index1,index2);
            reverse(nums,index1+1,n);
        }
    }
    static void swap(int nums[],int from,int to){
        int temp=nums[from];
        nums[from]=nums[to];
        nums[to]=temp;
    }
    static void reverse(int nums[],int start,int end){
        end=end-1;
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }*/
}  