class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> h = new HashMap<>();
    //   for(int i:nums){
    //     h.put(i,h.getOrDefault(i,0)+1);
    //   }
    //   for(int i:h.keySet()){
    //     if(h.get(i)==1){
    //         return i;
    //     }
    //   }
    for(int i:nums){
        if(h.containsKey(i)){
            int count = h.get(i);
            count++;
            h.put(i,count);
        }
        else{
            h.put(i,1);
        }
    }
      for (int i : h.keySet()) {

            if (h.get(i) == 1) {
                return i;
            }
        }
      return 0;
    }
}