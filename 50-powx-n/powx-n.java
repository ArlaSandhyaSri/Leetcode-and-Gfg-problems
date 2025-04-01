class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long pow=n;
        if(pow<0){
            pow=-1*pow;
        }
        while(pow>0){
            if(pow%2==0){  //if power is even half the power
            x=x*x;
            pow/=2;

            }else{
                ans*=x;
                pow-=1;
            }
        }
        if(n<0){
            ans=1/ans;
        }
        return ans;
        
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
    }
}