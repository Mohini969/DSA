class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        boolean even=true;
        for(int x:nums1){
            min=Math.min(min,x);
            if(x%2!=0){
            even = false;
            }
        } 
        if(min%2!=0) return true;
        if(even) return true;
        return false;  
    }
}