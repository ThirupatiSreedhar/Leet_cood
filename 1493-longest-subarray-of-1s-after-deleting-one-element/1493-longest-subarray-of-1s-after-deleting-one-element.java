class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int countzero=0;
        int max =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                countzero++;
            }
            while(countzero>1){
                if(nums[i]==0){
                    countzero--;
                }
                i++;
            }
            max= Math.max(max,j-i);
        }
        return max;
    }
}