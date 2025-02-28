class Solution {
    public int subarraySum(int[] nums, int k) {
        /*int n=nums.length;
        int sum=0;
        int cnt=0;
        for (int i = 0 ; i < n; i++){
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k){
                    cnt++;
                }
            }
        }
        return cnt;*/
       HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1); //if sum==k them this will help to increment the count
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum-k)){
                count+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}