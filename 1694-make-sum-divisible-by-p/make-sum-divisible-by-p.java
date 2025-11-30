class Solution {
    public int minSubarray(int[] nums, int p) {
        long total=0;
        for(int n:nums){
            total+=n;
        }
        long target=total%p;
        if(target==0){
            return 0;
        }

        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);

        long current=0;
        int result = nums.length;
        for(int i=0;i<nums.length;i++){
            current= (current+nums[i])%p;
            int need = (int)(current-target+p)%p;
            if(mp.containsKey(need)){
                result=Math.min(result,i-mp.get(need));
            }
            mp.put((int)current,i);


        }
        return result==nums.length?-1:result;
        
    }
}