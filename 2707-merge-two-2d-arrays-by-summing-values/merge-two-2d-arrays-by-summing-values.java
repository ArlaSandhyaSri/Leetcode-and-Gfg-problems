class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!mp.containsKey(nums1[i][0])){
                mp.put(nums1[i][0],nums1[i][1]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!mp.containsKey(nums2[i][0])){
                mp.put(nums2[i][0],nums2[i][1]);
            }else{
                int sum=mp.get(nums2[i][0])+nums2[i][1];
                mp.put(nums2[i][0],sum);
            }
        }
        Map<Integer, Integer> sortedMap = new TreeMap<>(mp);

       int[][] mergedArray=new int[mp.size()][2];
       int index=0;
     for(int i:sortedMap.keySet()){
        mergedArray[index][0]=i;
        mergedArray[index][1]=mp.get(i);
        index++;
       }
       return mergedArray;
        
    }
}