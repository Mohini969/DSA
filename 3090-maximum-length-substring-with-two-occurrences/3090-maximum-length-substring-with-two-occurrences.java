class Solution {
    public int maximumLengthSubstring(String s) {
        int count[] = new int[26];
        int ans = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            int i = s.charAt(right) - 'a';
            count[i]++;
            while (count[i] > 2) {
                count[s.charAt(left) - 'a']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);

        }
        return ans;
    }
}