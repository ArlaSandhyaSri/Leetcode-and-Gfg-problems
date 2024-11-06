class Solution {
    public double myPow(double x, int n) {
        /*double answer=1.0;
        long power=n;
        if(power<0){
            power=-1*power;
        }
        while(power>0){
            if(power%2==1){ 
                answer*=x;
                power-=1;          //odd power
            }
            else{        
    //even power multiplying base twice then power will be half; ex:2^10 can also be written    as (2^2)^5.
                x=x*x;
                power/=2;
            }

        }
        if(n<0){
            answer=1/answer;
        }
        return answer;*/
        double ans = 1.0;
        long power=n;
        if(power<0){
            power=-1*power;
        }
        while(power>0){
            if(power%2==1){
                ans*=x;
                power-=1;
            }
            else{
                x=x*x;
                power/=2;
            }
        }
        if(n<0){
            ans=1/ans;
        }
        return ans;
    }

}