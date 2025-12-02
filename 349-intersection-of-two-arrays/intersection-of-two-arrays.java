class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n=0;
        int m=0;

        while(n<nums1.length && m<nums2.length){
            if(nums1[n]<nums2[m]){
                n++;
            }else if(nums2[m]<nums1[n]){
                m++;
            }else{
                if(arr.size()==0 || arr.get(arr.size()-1)!=nums1[n]){
                    arr.add(nums1[n]);
                }
                n++;
                m++;

            }
        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
}