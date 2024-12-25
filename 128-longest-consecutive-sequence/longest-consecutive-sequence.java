class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxi=0;
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]-1==nums[i-1]){
                count++;
                maxi=Math.max(maxi,count);
            }
            else if(nums[i]!=nums[i-1]){
                count=0;
            }
        }
        return maxi+1;
        
    }
    //int n = a.length;
       /* if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;*/
}