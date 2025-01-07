class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missingnumber=arr[mid]-(mid+1);  
    //This will give information about no.of numbers missing till that particular index
            if(missingnumber<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return k+high+1;
        
    }
}