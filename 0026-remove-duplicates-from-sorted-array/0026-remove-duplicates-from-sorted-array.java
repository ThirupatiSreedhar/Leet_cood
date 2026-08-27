class Solution {
    public int removeDuplicates(int[] nums) {
       HashMap<Integer,Integer> h = new HashMap<>();
       int k=0;
  for(int i :nums){
    if(!h.containsKey(i)){
        h.put(i,1);
        
        nums[k]=i;
        k++;
    }
  }

        return k;
    }
}