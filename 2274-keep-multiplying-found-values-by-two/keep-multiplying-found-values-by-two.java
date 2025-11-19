class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        boolean found = true;
        while(found){
            found = valuefound(nums,original);
            if(found){
                original=2*original;
            }
        }
        return original;
    }
    static boolean valuefound(int nums[],int original){
        Arrays.sort(nums);
        int n=nums.length;
        int st =0;
        int end=n-1;

        while(st<=end){
            int mid = (st+end)/2;
            if(nums[mid]==original){
                return true;
            }
            else if(nums[mid]<original){
                st=mid+1;
            }else{
                end=mid-1;
            }

        }
        return false;

    }
}
