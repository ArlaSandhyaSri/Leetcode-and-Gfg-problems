class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        Arrays.sort(nums);
        boolean found = true;
        while(found){
            found = false;
            int st = 0;
            int end = n-1;
            while(st<=end){
                int mid=(st+end)/2;
                if(nums[mid]==original){
                    original=2*original;
                    found = true;
                }else if(nums[mid]<original){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return original;
    }
}
    //     int n=nums.length;
    //     boolean found = true;
    //     while(found){
    //         found = false;
    //         for(int i=0;i<n;i++){
    //             if(nums[i]==original){
    //                 found=true;
    //             }
    //         }
    //         if(found){
    //             original=2*original;
    //         }

    //     }
    //     return original;
        
    // }
