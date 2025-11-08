class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> arr = new ArrayList<>();

        int count1=0;
        int count2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(count1==0 && element2!=nums[i]){
                count1=1;
                element1=nums[i];
            }
            else if(count2==0 && element1!=nums[i]){
                count2=1;
                element2=nums[i];
            }
            else if(nums[i]==element1){
                count1++;
            }else if(nums[i]==element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        int cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element1){
                cnt1++;
            }
            else if(nums[i]==element2){
                cnt2++;
            }
        }

        if(cnt1>n/3){
            arr.add(element1);
        }
        if(cnt2>n/3){
            arr.add(element2);
        }
        return arr;
        // for(int i=0;i<n;i++){
        //     if(arr.size()==0 || arr.get(0)!=nums[i]){
        //         int count=0;
        //         for(int j=0;j<n;j++){
        //             if(nums[i]==nums[j]){
        //                 count++;
        //             }
        //         }
        //         if(count>(n/3)){
        //             arr.add(nums[i]);
        //         }

        //         if(arr.size()==2){
        //             break;

        //         }
        //     }
            
        // }

        // return arr;
        
    }
}