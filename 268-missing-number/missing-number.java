class Solution {
    public int missingNumber(int[] nums) {
        
        /*int n=nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!(hs.contains(i))){
                return i;
            }
        }
        return 0;*/
        //Optimal1
        int n = nums.length;
        int sum=(n*(n+1))/2;
        int sum_a=0;
        for(int i=0;i<n;i++){
            sum_a=sum_a+nums[i];
        }
        return sum-sum_a;
        
         //Optimal-2
        /*int XOR_M=0;
        int XOR_S=0;
        for(int i=0;i<nums.length;i++){
            XOR_S^=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            XOR_M^=i;
        }
        return XOR_S^XOR_M;*/
    }
}