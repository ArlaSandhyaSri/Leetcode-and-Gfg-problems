class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans==-1?nums.length:ans;
    }
}
       /* int l=0;
        int h=nums.length-1;
        int ans=nums.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;

    }
}*/