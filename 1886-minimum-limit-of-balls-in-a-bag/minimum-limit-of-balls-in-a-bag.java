class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }
        
        int result = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(nums, maxOperations, mid)) {
                result = mid; 
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        
        return result;
    }
    
    private boolean canDistribute(int[] nums, int maxOperations, int penalty) {
        int operations = 0;
        for (int num : nums) {
            operations += (num - 1) / penalty; 
        }
        return operations <= maxOperations;
    }
}