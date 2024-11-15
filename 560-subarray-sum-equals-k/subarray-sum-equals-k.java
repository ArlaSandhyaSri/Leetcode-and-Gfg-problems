class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int cnt=0;
        for (int i = 0 ; i < n; i++){
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
       // HashMap
       /* HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int count=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum-k;
            if(mp.containsKey(rem)){
                count+=mp.get(rem);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;*/
    }
}