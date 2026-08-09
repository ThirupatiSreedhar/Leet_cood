class Solution {
    public int[] findErrorNums(int[] nums) {
      HashSet<Integer> h = new HashSet<>();
      int duplicate =0;
      int missing=0;
        for(int i:nums){
            if(h.contains(i)){
                duplicate=i;
            }
            h.add(i);
        }
         for(int i=0;i<=nums.length;i++){
            if(!h.contains(i)){
                missing=i;
            }
         }
         return new int[]{ duplicate,missing};
          }
}