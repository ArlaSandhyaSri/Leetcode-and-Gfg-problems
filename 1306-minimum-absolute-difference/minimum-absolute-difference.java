class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){

            if(Math.abs(arr[i]-arr[i-1])<mindiff){
                mindiff=Math.abs(arr[i]-arr[i-1]);
                ans = new ArrayList<>();
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(Math.abs(arr[i]-arr[i-1]) == mindiff){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }

        }
        return ans;
    }
}