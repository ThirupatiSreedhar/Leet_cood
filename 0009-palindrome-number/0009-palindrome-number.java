class Solution {
    public boolean isPalindrome(int x) {
       int save = x;
       int rev=0;
       while(x>0){
       int  last = x%10;
       rev=(rev*10)+last;
       x=x/10;
       } 
       if(rev==save){
        return true;
       }
       return false;
    }
}