class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int num=0;
        if(temp<0){
            return false;
        }
        while(temp!=0){
            int rem=temp%10;
            num=num*10+rem;
            temp/=10;
        }
        if(num==x){
            return true;
        }

        return false;

        
    }
}