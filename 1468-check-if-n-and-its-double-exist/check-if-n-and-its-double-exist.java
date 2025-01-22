class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(2*arr[i])){
                return true;
            }
            if(arr[i]%2==0){
                if(mp.containsKey(arr[i]/2)){
                    return true;
                }
            }
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        return false;
    }
}

    /* private int search(int[] arr, int target, int n) {
        for (int i = 0; i <n; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i] * 2;
            int val = search(arr, target, arr.length);
            if (val != -1 && val != i) {
                return true;
            }
        }
        return false;
    }
}
}*/
       