class Solution {
    public int countSubstrings(String s) {
       int count=0;
       for(int i=0;i<s.length();i++){
        String sub="";
        for(int j=i;j<s.length();j++){
            //sub=sub+s.charAt(j);
         if(isPalindrom(s,i,j)){
            count++;
         }
        }
       } 
       return count;
    }
    public boolean isPalindrom(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}