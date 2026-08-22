class Solution {
    public boolean checkDivisibility(int n) {
        int i=n; //for keping the original value
        int sum=0;
        int product=1;
        if(n<0) return false;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }if(i%(sum+product)==0){
            return true;
        }
        return false;
    }
}