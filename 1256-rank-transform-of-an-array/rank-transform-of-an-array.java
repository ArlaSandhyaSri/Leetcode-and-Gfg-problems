class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int num[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(num);
        HashMap<Integer,Integer> mp = new HashMap<>();
        int r=1;
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(num[i])){
                mp.put(num[i],r++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;


        
    }
}