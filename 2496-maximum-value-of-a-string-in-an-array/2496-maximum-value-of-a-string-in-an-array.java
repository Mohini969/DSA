class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        int v;
        for(String s:strs){
            if(s.matches("[0-9]+")){
                v=Integer.parseInt(s);
            }else {
                v=s.length();
            }
            max=Math.max(max,v);
        }
        return max;
    }
}