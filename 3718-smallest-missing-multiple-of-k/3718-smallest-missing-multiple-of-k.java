class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int mul=k;
        while(set.contains(mul)){
            mul+=k;
        }
        return mul;
    }
}