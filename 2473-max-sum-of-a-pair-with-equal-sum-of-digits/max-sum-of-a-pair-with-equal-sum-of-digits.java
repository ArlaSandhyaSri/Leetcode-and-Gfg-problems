class Solution {
    public int maximumSum(int[] nums) {
        int[] storage = new int[90];
        int max = -1;
        
        for(int num : nums){
            int sumOfDigit = sum(num);
            if(storage[sumOfDigit] != 0){
                int localSum = storage[sumOfDigit] + num;
                max = Math.max(max, localSum);
                storage[sumOfDigit] = Math.max(num, storage[sumOfDigit]);
            } else {
                storage[sumOfDigit] = num;
            }
        }
        return max;
    }

        //O(n)
      /*  int maxsum=-1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=sum(nums[i]);
            if(mp.containsKey(n)){
                maxsum=Math.max(maxsum,nums[i]+mp.get(n));
            }
            mp.put(n,Math.max(mp.getOrDefault(n,0),nums[i]));
        }
        return maxsum;
    }*/


    //O(n2)-TLE
        /*int maxisum=-1;
        for(int i=0;i<nums.length-1;i++){
            int first=sum(nums[i]);
            int j=i+1;
            while(j<nums.length){
                //int first=sum(nums[i]);
                int second=sum(nums[j]);
                if(first==second){
                    maxisum=Math.max(maxisum,(nums[i]+nums[j]));
                }
                j++;
            }
        }
        return maxisum;
        
    }*/
    static int sum(int num){
        int sum=0;
        while(num!=0){
            int n=num%10;
            sum+=n;
            num/=10;
        }
        return sum;
    }
}