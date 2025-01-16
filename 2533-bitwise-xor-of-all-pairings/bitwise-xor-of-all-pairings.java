class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
         int xor1 = 0, xor2 = 0;
        
        // XOR all elements in nums1
        for (int num : nums1) {
            xor1 ^= num;
        }
        
        // XOR all elements in nums2
        for (int num : nums2) {
            xor2 ^= num;
        }
        
        // Calculate the result based on the parity of the lengths
        int result = 0;
        if (nums2.length % 2 == 1) {
            result ^= xor1; // nums1 contributes if nums2's length is odd
        }
        if (nums1.length % 2 == 1) {
            result ^= xor2; // nums2 contributes if nums1's length is odd
        }
        
        return result;
    }
}
        /*int ans=0;
    
        for(int i=0;i<nums1.length;i++){
            int xo=nums1[i];
            for(int j=0;j<nums2.length;j++){
                xo=xo^nums2[j];
            }
            ans=ans^xo;
        }
        return ans;
        
    }
}*/