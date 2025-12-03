class NumArray {
    int prefSum[];


    public NumArray(int[] nums) {
        prefSum=new int[nums.length+1];
        int sum=0;
        prefSum[0]=0;
        for(int i=1;i<prefSum.length;i++){
            prefSum[i]=prefSum[i-1]+nums[i-1];
        }
        
    }
    
    public int sumRange(int left, int right) {
        return prefSum[right+1]-prefSum[left];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */