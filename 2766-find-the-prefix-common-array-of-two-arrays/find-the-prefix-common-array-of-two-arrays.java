class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        /*int c[]=new int[A.length];
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
        return c;*/

        int[] stat = new int[A.length + 1];
        int[] c = new int[A.length];

        int cur = 0;
        for (int i = 0; i < A.length; i++) {
            stat[A[i]]++;
            if (stat[A[i]] == 2) {
                cur++;
            }
            stat[B[i]]++;
            if (stat[B[i]] == 2) {
                cur++;
            }
            c[i] = cur;
        }
        return c;
        
    }
}