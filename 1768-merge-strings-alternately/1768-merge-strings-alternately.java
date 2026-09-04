class Solution {
    public String mergeAlternately(String word1, String word2) {
       int i=0;
       int j=0;
       String c = "";
       int peek=0;
       while(i<=word1.length()-1&&j<=word2.length()-1) {
        if (peek==0){
            c=c+word1.charAt(i);
            i++;
            peek=1;

        }else{
            c=c+word2.charAt(j);
            j++;
            peek=0;
       }
       }
       while(i<=word1.length()-1){
        c=c+word1.charAt(i);;
        i++;
       }
       while(j<=word2.length()-1){
        c=c+word2.charAt(j);;
        j++;
       }
       return c;
    }
}