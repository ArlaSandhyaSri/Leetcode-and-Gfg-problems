class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];

        /*int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;*/

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                ans[0]=mp.get(nums[i]);
                ans[1]=i;
                break;
            }
            else{
                mp.put(target-nums[i],i);
            }
        }
        return ans;
    }
    
}