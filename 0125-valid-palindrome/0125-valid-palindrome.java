class Solution {
    public boolean isPalindrome(String s) {
        int p=0; int q=s.length()-1;
        while(p<q){
            if(!Character.isLetterOrDigit(s.charAt(p))){
                p++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(q))){
                q--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(p))!=Character.toLowerCase(s.charAt(q))) return false;
            p++;
            q--;
        }
        return true;
    }
}