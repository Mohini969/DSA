import java.util.*;
class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int c = set.size();
                ans += c * c;
            }
        }
        return ans;
    }
}
