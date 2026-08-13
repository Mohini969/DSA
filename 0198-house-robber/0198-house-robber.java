class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int prev1=0;
        int prev2=0;

        for(int money:nums){
            int curr=Math.max(prev1,prev2+money);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}