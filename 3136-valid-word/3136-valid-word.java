class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3) return false;

        boolean vow=false; boolean con=false;

        for(int i=0;i<n;i++){
            char ch=Character.toLowerCase(word.charAt(i));
            if(!Character.isLetterOrDigit(ch)) return false;

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vow=true;

            else if(Character.isLetter(ch)) con=true;
        }
        return vow&&con;
    }
}