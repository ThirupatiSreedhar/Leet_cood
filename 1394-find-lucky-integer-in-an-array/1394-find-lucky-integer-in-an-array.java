class Solution {
    public int findLucky(int[] arr) {
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int x : arr){
            int count = h.getOrDefault(x,0);
            count++;
            h.put(x,count);
        }
        int ans =-1;
        for(int i:h.keySet()){
            if(h.get(i)==i){
                ans=Math.max(ans,i);
                
            }
        }
         return ans;
    }
}