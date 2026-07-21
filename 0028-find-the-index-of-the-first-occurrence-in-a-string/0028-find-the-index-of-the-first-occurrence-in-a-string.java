class Solution {
    public int strStr(String haystack, String needle) {
        haystack=haystack.replace(needle,"*");
        int k=0;
        for(char i :haystack.toCharArray()){
            if(i=='*'){
                return k;
            }
            k++;
        }
        return -1;
    }
}