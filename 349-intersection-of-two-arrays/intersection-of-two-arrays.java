class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }


        for(int i:set1){
            if(set2.contains(i)){
                res.add(i);
            }
        }

        int ar[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ar[i]=res.get(i);
        }
        return ar;
        
    }
}