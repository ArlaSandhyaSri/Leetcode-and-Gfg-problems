class Solution {
    public int majorityElement(int[] nums) {
        /*int n =nums.length;
        int count=0;
        int element=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(count==0){
                count++;
                element=nums[i];
            }
            else if(element==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        /*int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==element){
                count1++;
            }
        }*/
       // if(count1>n/2){
       // return element;
        //}*/
        
        //BruteForce
        /*int maj=-1;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return -1;*/

        //Better

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}