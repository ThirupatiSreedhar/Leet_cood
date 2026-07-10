class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int num=n;
        int pro=1;
       while(n>0){
        int r =n%10;
         sum=sum+r;
         pro=pro*r;
         n/=10;
       }
      
          int total = sum + pro;
        return num % total == 0;
    }
}