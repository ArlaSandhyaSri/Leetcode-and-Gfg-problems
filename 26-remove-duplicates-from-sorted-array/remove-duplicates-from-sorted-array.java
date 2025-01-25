class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[j]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
}
        /*int n=nums.length;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j++]=nums[i];
            }
        }
        return j;
        
    }
}*/