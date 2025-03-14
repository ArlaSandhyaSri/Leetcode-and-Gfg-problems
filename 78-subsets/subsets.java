class Solution {
    List<List<Integer>> finall=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subset(nums,0,new ArrayList<>());
        return finall;
    }
    public void subset(int nums[],int index,ArrayList<Integer>temp){
        if(index>=nums.length){
            finall.add(new ArrayList(temp));
            return;
        }
        temp.add(nums[index]);
        subset(nums,index+1,temp);
        temp.remove(temp.size()-1);
        subset(nums,index+1,temp);
    }
}