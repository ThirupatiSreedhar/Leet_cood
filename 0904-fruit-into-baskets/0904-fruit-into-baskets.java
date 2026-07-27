class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int ans=0;
        int l=0;
        for(int r=0;r<fruits.length;r++){
            h.put(fruits[r],h.getOrDefault(fruits[r],0)+1);
            while(h.size()>2){
                h.put(fruits[l],h.get(fruits[l])-1);
                if(h.get(fruits[l])==0){
                    h.remove(fruits[l]);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}