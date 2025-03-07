class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean freq[]=new boolean[nums.length];
        generate(nums,new ArrayList<>(),ans,freq);
        return ans;
    }
    static void generate(int nums[],List<Integer>temp,List<List<Integer>>ans,boolean[] freq){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i] || (i>0 && nums[i]==nums[i-1] && !freq[i-1])){continue;}
            freq[i]=true;
            temp.add(nums[i]);
            generate(nums,temp,ans,freq);
            freq[i]=false;
            temp.remove(temp.size()-1);
            
        }
        
    }
}