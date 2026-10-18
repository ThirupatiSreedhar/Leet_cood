class Solution {
    public int strStr(String haystack, String needle) {
        haystack=haystack.replace(needle,"*");
        int k=0;//hello index is 2 it will converted he*o
        for(char i : haystack.toCharArray()){
            if(i == '*'){
                return k;
            }
            k++;
        }
        return -1;
    }
}