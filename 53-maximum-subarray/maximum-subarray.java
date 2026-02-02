class Solution {
    public int maxSubArray(int[] nums) {

//         int sum = 0 , maxi = Integer.MIN_VALUE;;
//         int i = 0 , j = 0;
//         while(j<nums.length){
           
//             if(sum < 0 && nums[j] >= sum){
//                 sum = 0;
//                 i = j;
//             }
//              sum += nums[j];
//             maxi = Math.max(maxi , sum);
//             j++;
//         }
//         return maxi;
//     }
// }

        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }

        }
        return maxi;
    }
}
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=nums[i];
        //     maxi=Math.max(sum,maxi);
        //     for(int j=i+1;j<n;j++){
        //         sum+=nums[j];
        //         maxi=Math.max(maxi,sum);
        //     }
        // }
        // return Math.max(maxi,sum);
        
