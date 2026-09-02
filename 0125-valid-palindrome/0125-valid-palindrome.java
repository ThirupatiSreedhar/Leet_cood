class Solution {
    public boolean isPalindrome(String s) {
        // s=s.toLowerCase();
        // char[] a= s.toCharArray();
        // String s1="";
        // for(int i = a.length-1;i>=0;i--){
        //     if(Character.isLetterOrDigit(a[i])){
        //         s1=s1+a[i];
        
        //     }
        //     }
        //     String s2="";
        //     for(int i=0;i<a.length;i++){
        //         if(Character.isLetterOrDigit(a[i])){
        //         s2=s2+a[i];
        
        //     }
        //     }
        // if(s1.equals(s2)){
        //     return true;
        // }
        // return false;
        int i=0;
        int j=s.length()-1;
        while(i<j){
           while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
           }
           while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
            j--;
           }
           char c1 = Character.toLowerCase(s.charAt(i));
           char c2 = Character.toLowerCase(s.charAt(j)); 
           if(c1!=c2){
            return false;
           }
           i++;
           j--;
             
        }
          return true;
    }
}