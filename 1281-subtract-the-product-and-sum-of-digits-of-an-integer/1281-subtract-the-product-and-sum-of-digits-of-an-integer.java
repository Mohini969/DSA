class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;    //product
        int s=0;    //sum

        while(n>0){
            int digit =n%10;
            p*=digit;
            s+=digit;
            n=n/10;
        }
        return p-s;
    }
}