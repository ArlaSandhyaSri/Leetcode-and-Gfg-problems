class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        //1)set
        Set<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<=n;i++){
            if(!(hs.contains(i))){
                return i;
            }
        }
        return -1;
      /*  int n=nums.length;
        int sum_ofn=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum_ofn-sum;*/
        
    }
}