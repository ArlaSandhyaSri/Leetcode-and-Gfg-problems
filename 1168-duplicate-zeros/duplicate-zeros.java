class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                shift(arr,i);
                if(i+1<arr.length){
                    arr[i+1]=0;
                    i++;
                }
            }
        }
        
    }
    static void shift(int arr[],int index){
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }

    }
}