class Solution {
    public int majorityElement(int[] nums) {        
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

        /*HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;*/

        //Optimal --> using moore voting algo
        int element=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
                count++;
            }
            else if(element==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                c++;
            }
        }
        if(c>nums.length/2){
            return element;
        }
        return -1;
    }
}