class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*int n =nums.length;
        int arr[]=new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]=mp.get(target-nums[i]);
            }
            mp.put(nums[i],i);
        }
        return arr;*/
        int as[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    as[0]=i;
                    as[1]=j;
                }
            }
        }
        return as;
        
    }
    
}