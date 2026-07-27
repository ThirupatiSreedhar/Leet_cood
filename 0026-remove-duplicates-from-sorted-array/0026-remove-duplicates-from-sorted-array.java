class Solution {
    public int removeDuplicates(int[] nums) {
       // HashMap <Integer,Integer> hm = new HashMap<>();
      
        int k = 0;

        for (int i=1;i<nums.length;i++) {
            // if (!hm.containsKey(num)) {
            //     hm.put(num, 1);
            //     nums[k] = num;
            //     k++;
            // }
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }

        return k+1;
    }
}