class Solution {
    public double myPow(double x, int n) {
        long pow=n;
        double ans=1;

        if(pow<0){
            x=1/x;
            pow=-pow;
        }
        while(pow>0){
            if(pow%2==1){
                ans*=x;
            }
            x=x*x;
            pow=pow/2;
        }
        return ans;
    }
}