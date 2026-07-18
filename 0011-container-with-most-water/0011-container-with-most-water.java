class Solution {
    public int maxArea(int[] h) {
       ArrayList<Integer> a = new ArrayList<>();
       int i=0;
       int j =h.length-1;
       while(i<j){
        int curr=Math.min(h[i],h[j])*(j-i);
        a.add(curr);
        if(h[i]<h[j]){
            i=i+1;
        }else{
            j=j-1;
        }
       }  
       return Collections.max(a);
    }
}