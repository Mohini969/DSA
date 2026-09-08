class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n<1000) return 0;
        for(int i=0;i<=n;i++){
            if(i>=1000) c++;
        }
        return c;
    }
}