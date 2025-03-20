class Solution {
    public int[] nextGreaterElements(int[] nums) {
        /*int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Integer.MIN_VALUE;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    ans[i]=nums[j];
                    break;
                }
            }
            if(ans[i]==Integer.MIN_VALUE){
                for(int k=0;k<i;k++){
                    if(nums[k]>nums[i]){
                        ans[i]=nums[k];
                        break;
                    }
                }
            }
            if(ans[i]==Integer.MIN_VALUE){
                ans[i]=-1;
            }

        }
        return ans;*/

        //Optimized
        Stack<Integer> st = new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=(2*nums.length)-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                st.pop();
            }
            if(i<nums.length){
                if(!st.isEmpty()){
                    ans[i]=st.peek();
                }else{
                    ans[i]=-1;
                }
            }
            st.push(nums[i%nums.length]);
        }
        return ans;

        
    }
}