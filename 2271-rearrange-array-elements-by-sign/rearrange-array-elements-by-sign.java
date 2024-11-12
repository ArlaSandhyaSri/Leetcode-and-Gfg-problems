class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

        //Brute

        /*ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        int arr[]=new int[n];
        int i=0;
        int j=0;
        int k=0;
        while(i<pos.size() && j<neg.size()){
            if(k%2==0){
                arr[k++]=pos.get(i++);
            }else{
                arr[k++]=neg.get(j++);
            }
        }
        while(i<pos.size()){
            arr[k++]=pos.get(i++);
        }while(j<neg.size()){
            arr[k++]=neg.get(j++);
        }
        return arr;*/

        //Optimal

        int arr[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[pos]=nums[i];
                pos+=2;
            }else{
                arr[neg]=nums[i];
                neg+=2;
            }
        }
        return arr;
        
    }
}