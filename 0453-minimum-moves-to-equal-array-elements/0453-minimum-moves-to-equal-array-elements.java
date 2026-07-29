class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);//1,2,3
       int minimum=nums[0];
       int move = 0;
       for(int i=0;i<nums.length;i++){
     move += Math.abs(nums[i] - minimum);//2-1=1;2-2=1;3-1=2
       }
       return move;
    }
}