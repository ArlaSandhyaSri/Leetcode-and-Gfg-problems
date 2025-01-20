class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }


        int ar[]=new int[res.size()];
        int i=0;
        for(int j:res){
            ar[i++]=j;
        }
        return ar;
        
    }
}