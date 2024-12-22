class Solution {
    public int reverse(int x) {
        long num=0;
        while(x!=0){
            long rem=x%10;
            num=num*10+rem;
            x/=10;
        }
        if(num>Integer.MIN_VALUE && num<Integer.MAX_VALUE){
            return (int)num;
        }else{
            return 0;
        }
        
    }
}