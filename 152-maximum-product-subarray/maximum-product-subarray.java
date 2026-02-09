class Solution {
    public int maxProduct(int[] nums) {
        int max_product = Integer.MIN_VALUE;
        int n=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     int product = 1;
        //     for(int j=i;j<nums.length;j++){
        //         product*=nums[j];
        //         max_product = Math.max(max_product,product);
        //     }

        // }
        // return max_product;

        int pref=1;
        int suf=1;

        for(int i=0;i<nums.length;i++){
            if(pref==0){
                pref=1;
            }
            if(suf==0){
                suf=1;
            }

            pref*=nums[i];
            suf*=nums[n-i-1];

            max_product = Math.max(max_product,Math.max(pref,suf));



        }
        return max_product;
        
    }
}