class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> ar = new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        permutations(nums,ans,ar,freq);
        return ans;
    }
    static void permutations(int nums[],List<List<Integer>> ans,List<Integer>ar,boolean freq[]){
        if(ar.size()==nums.length){
            ans.add(new ArrayList<>(ar));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ar.add(nums[i]);
                permutations(nums,ans,ar,freq);
                ar.remove(ar.size()-1);
                freq[i]=false;
            }
        }
    }

}