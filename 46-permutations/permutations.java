class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ar = new ArrayList<>();
        boolean freq[]=new boolean[nums.length];

        permutations(nums,ar,ans,freq);
        return ans;
        
    }
    static void permutations(int nums[],List<Integer>ar,List<List<Integer>>ans,boolean freq[]){
        if(ar.size()==nums.length){
            ans.add(new ArrayList<>(ar));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ar.add(nums[i]);
                permutations(nums,ar,ans,freq);
                ar.remove(ar.size()-1);
                freq[i]=false;
            }
        }
    }
}