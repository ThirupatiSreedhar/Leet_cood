class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : nums){
            if(h.containsKey(x)&&h.get(x)==2){
                return false;
            }else if(h.containsKey(x)){
                h.put(x, h.get(x) + 1);
            }else{
               h.put(x,1);
            }
        }
        return true;
    }
}