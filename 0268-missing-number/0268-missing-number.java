class Solution {
    public int missingNumber(int[] nums) {
    //  HashSet<Integer> hs = new HashSet<>();
    //  for(int i :nums){
    //     hs.add(i);
    //  }
    //  for(int i=0;i<nums.length+1;i++){
    //     if(!hs.contains(i)){
    //         return i;
    //     }
    
    //  }
    //   return 1;
   
        int xor = 0;

        // Loop 1: 0 to n
        for (int i = 0; i <= nums.length; i++) {
            xor = xor ^ i;
        }

        // Loop 2: array elements
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }

  
}