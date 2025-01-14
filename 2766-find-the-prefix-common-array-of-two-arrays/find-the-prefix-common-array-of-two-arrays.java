class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int c[]=new int[A.length];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<A.length;i++){
            int count=0;
            mp.put(A[i],mp.getOrDefault(A[i],0)+1);
            mp.put(B[i],mp.getOrDefault(B[i],0)+1);

            for(Map.Entry<Integer,Integer> en:mp.entrySet()){
                if(en.getValue()>=2){
                    count++;
                }
            }
            c[i]=count;
        }
        return c;
        
    }
}