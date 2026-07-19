class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        String s1 ="";
        for(char c : st){
            s1=s1+c;
        }
        return s1;
    }
}