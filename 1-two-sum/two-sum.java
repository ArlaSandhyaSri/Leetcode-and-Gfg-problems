class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];

        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
        //Brute - O(N2)

       /* int as[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    as[0]=i;
                    as[1]=j;
                }
            }
        }
        return as;*/


        //Better Approach

       /* int ar[]=new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                ar[0]=i;
                ar[1]=mp.get(nums[i]);
                break;
            }
            mp.put(target-nums[i],i);
        }
        return ar;*/
    }
    
}