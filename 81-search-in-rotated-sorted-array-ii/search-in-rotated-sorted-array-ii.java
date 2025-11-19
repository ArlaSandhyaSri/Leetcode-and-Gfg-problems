class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int st=0;
        int end = n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target){
                return true;
            }

            if(nums[st]==nums[mid]) {
                st++;
                continue;
            }
            // if(nums[mid]==nums[end]){
            //     end--;
            //     continue;
            // }

            if(nums[mid]>nums[st]){
                if(nums[mid]>target && nums[st]<=target){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[end]>=target){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
        
    }
}