class Solution {
    public int search(int[] nums, int target) {
        /*int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==target){
                return i;
            }else{
                i++;
            }
        }
        return -1;*/
       /* int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;*/

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}