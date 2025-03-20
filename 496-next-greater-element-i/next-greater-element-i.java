class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //bruteforce
       /* int an=0;
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j;k<nums2.length;k++){
                        if(nums2[k]>nums1[i]){
                            ans[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        return ans;*/
        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                mp.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.getOrDefault(nums1[i],-1);
        }
        return ans;
        
        
    }
}