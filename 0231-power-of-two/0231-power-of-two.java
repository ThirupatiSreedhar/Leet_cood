class Solution {
    public boolean isPowerOfTwo(int n) {
     if(n==1){
        return true;
     }   
     double pow=1;
     while(true){
        pow=pow*2;
        if(n==pow){
            return true;
        }else if(pow>n){
            return false;

        }

     }
    }
}