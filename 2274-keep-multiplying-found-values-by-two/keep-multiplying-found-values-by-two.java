class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        boolean found = true;
        while(found){
            found = false;
            for(int i=0;i<n;i++){
                if(nums[i]==original){
                    found=true;
                }
            }
            if(found){
                original=2*original;
            }

        }
        return original;
        
    }
}