class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                mp.put(nums[i]*nums[j],mp.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        int result=0;

        for(int val:mp.values()){
            if(val>1){
                // Each product count represents a pair (a, b).  
                // Choosing two pairs forms a * b = c * d.
                // C(n, 2) = n * (n - 1) / 2
                int pair=(val*(val-1))/2;  
                // a * b = c * d can be arranged in 8 different ways
                result+=pair*8;
            }
        }
        return result;
        
    }
}