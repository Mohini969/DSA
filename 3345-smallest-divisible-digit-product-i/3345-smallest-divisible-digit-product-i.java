class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int i = n;
            while (i > 0) {
                product *= i % 10;
                i /= 10;
            }
            if (product % t == 0) {
                return n;
            }
            n++;
        }
    }
}