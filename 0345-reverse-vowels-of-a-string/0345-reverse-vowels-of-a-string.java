class Solution {
    static boolean is_vowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
        else return false;
    }
    public String reverseVowels(String s) {
        int p=0; int q=s.length()-1;
        char []arr= s.toCharArray();
        while(p<q){
            if(!is_vowel(arr[p])) p++;
            else if(!is_vowel(arr[q])) q--;
            else{
                char temp=arr[p];
                arr[p]=arr[q];
                arr[q]=temp;
                p++;
                q--;
            }
        }
        String a=new String(arr);
        return a;
    }
}