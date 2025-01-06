class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[start];
       /* int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=(l+h)/2;
            if(nums[mid]>nums[h]){ //If mid is greater than end element then the smallest elements will lie between mid+1 and h only 
                l=mid+1;
            }else{
                h=mid;  //else between start to mid;
            }
        }
        return nums[h];*/
        
    }
}