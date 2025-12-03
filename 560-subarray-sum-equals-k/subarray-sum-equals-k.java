class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
        //         }
            
        //     }
        // }
        // return count;
        int count=0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum-k)){
                count=count+mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);

            
        }
        return count;

        
    }
}