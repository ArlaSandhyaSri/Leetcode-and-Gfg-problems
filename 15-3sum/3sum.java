class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        //brute
        // Set<List<Integer>> ar = new HashSet<>();
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> lt = Arrays.asList(nums[i],nums[j],nums[k]);
        //                 lt.sort(null);

                    
        //                 ar.add(lt);
                        
        //             }
        //         }

        //     }
        // }
        // List<List<Integer>> finall = new ArrayList<>(ar);
        // return finall;


        //better
        Set<List<Integer>> arr = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hs = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(hs.contains(third)){
                    List<Integer> ar = Arrays.asList(nums[i],nums[j],third);

                    ar.sort(null);
                    arr.add(ar);
                }

                hs.add(nums[j]);
            }
        }

        List<List<Integer>> finall = new ArrayList<>(arr);
        return finall; 



        
    }
}