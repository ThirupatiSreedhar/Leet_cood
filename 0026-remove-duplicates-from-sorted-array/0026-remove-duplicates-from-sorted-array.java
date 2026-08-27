class Solution {
    public int removeDuplicates(int[] nums) {
//        HashMap<Integer,Integer> h = new HashMap<>();
//        int k=0;
//   for(int i :nums){
//     if(!h.containsKey(i)){
//         h.put(i,1);
        
//         nums[k]=i;
//         k++;
//     }
//   }
     int k=0;
     for(int i=0;i<nums.length;i++){
        if(nums[k]!=nums[i]){
            k++;
            nums[k]=nums[i];
        }
     }

        return k+1;
    }
}