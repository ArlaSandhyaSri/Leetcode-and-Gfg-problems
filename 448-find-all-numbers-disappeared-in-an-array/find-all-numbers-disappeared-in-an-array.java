class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!st.contains(i)){
                ar.add(i);
            }
        }
        return ar;
        
    }
}