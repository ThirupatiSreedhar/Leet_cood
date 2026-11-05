class Solution {
    public int minSubArrayLen(int target, int[] nums) {
   
//   int sum=0;
//   int l=0;
//   int min =Integer.MAX_VALUE;
  
//   for(int i=0;i<nums.length;i++){
//     sum=sum+nums[i];
//     while (sum>=target){
//         sum=sum-nums[l];
//         min= Math.min(min,r-l+1);
//         l++;
//     }
//   }
    int sum=0;
    int l=0;
   int min=Integer.MAX_VALUE;
   for(int r=0;r<nums.length;r++){
         sum=sum+nums[r];
        while(sum>=target){
            sum=sum-nums[l];
        min=Math.min(min,r-l+1);
        l++;   
        }
       
   }
    return min==Integer.MAX_VALUE?0:min;
    }
}