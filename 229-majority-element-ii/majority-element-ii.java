class Solution {
    public List<Integer> majorityElement(int[] nums) {
       /* int n =nums.length;
        int count1=0;
        int count2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && element2!=nums[i]){
                count1++;
                element1=nums[i];
            }
            else if(count2==0 && element1!=nums[i]){
                count2++;
                element2=nums[i];
            }
            else if(element1==nums[i]){
                count1++;
            }
            else if(element2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element1){
                count1++;
            }else if(nums[i]==element2){
                count2++;
            }
        }
        ArrayList<Integer> ar = new ArrayList<>();
        if(count1>n/3){
            ar.add(element1);
        }
        if(count2>n/3){
            ar.add(element2);
        }
        return ar;*/
        ArrayList<Integer> ar = new ArrayList<>();

        int n=nums.length;
        int count1=0;
        int count2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(count1==0 && element2!=nums[i]){
                element1=nums[i];
                count1++;
            }
            else if(count2==0 && element1!=nums[i]){
                element2=nums[i];
                count2++;
            }
            else if(nums[i]==element1){
                count1++;
            }
            else if(nums[i]==element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==element1){
                count1++;
            }
            else if(nums[i]==element2){
                count2++;
            }
        }
        if(count1>n/3){
            ar.add(element1);
        }
        if(count2>n/3){
            ar.add(element2);
        }
        return ar;

    }
}