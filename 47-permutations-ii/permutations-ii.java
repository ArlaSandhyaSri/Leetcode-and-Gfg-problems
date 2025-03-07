class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        generate(0,nums,temp,ans,freq);
        return ans;
    }
    static void generate(int index,int nums[],List<Integer>temp,List<List<Integer>>ans,boolean[] freq){
        if(index==nums.length){
            if(!ans.contains(temp)){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i]){continue;}
            freq[i]=true;
            temp.add(nums[i]);
            generate(index+1,nums,temp,ans,freq);
            temp.remove(temp.size()-1);
            freq[i]=false;
        }
        
    }
}