class Solution {
    public boolean isPalindrome(int x) {
        int a= x;
        //int sign= x<0?-1:1;
        int num= Math.abs(x);
        long rev=0;
        int digit;
        while(num>0){
            digit=num%10;
            num=num/10;
            rev=rev*10+digit;
        }
        int finalrev=(int)(rev);
        if(finalrev==a) return true;
        return false;
    }
}