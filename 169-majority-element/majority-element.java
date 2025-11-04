class Solution {
    public int majorityElement(int[] nums) {

        int n=nums.length;
        int element=-1;
        int count=0;

        for(int i=0;i<n;i++){
            if(count==0){
                element=nums[i];
                count++;
            }
            else if(nums[i]==element){
                count++;
        
            }else{
                count--;
            }
        }

        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==element){
                c++;
            }
        }

        if(c>n/2){
            return element;
        }
        return -1;

        // HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        
        // for(int i=0;i<n;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        // } 
        // for(Map.Entry<Integer,Integer> et:mp.entrySet())    {
        //     if(et.getValue()>n/2){
        //         return et.getKey();
        //     }
        // }  
        // return -1;
    }
}