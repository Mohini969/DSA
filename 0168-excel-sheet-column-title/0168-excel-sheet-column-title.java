class Solution {
    public String convertToTitle(int colNo) {
        StringBuilder sb=new StringBuilder();
        while(colNo>0){
            colNo--;
            int rem=colNo%26;
            sb.append((char)('A'+rem));
            colNo/=26;
        }
        return sb.reverse().toString();
    }
}