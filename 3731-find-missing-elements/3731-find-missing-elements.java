class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int min=nums[0];
        int max=nums[0];

        for (int n:nums){
            set.add(n);
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        List<Integer> op=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                op.add(i);
            }
        }
        return op;
    }
}