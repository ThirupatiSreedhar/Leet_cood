class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
       int k =0;
       for(int x :nums){
        if(!h.containsKey(x)){
            h.put(x,1);
            nums[k]=x;
            k++;
       }
       }
       return k;
    }
}