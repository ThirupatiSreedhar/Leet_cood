class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int max=nums[0];
         int min=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     int pro=1;
        //     for(int j=i;j<nums.length;j++) {
        //         pro=pro*nums[j];
        //         ans=Math.max(ans,pro);
        //     }
        // }
        for(int i=1;i<nums.length;i++){
            int temp=max;
            max=Math.max(nums[i] ,Math.max(temp*nums[i],min*nums[i]));
            min=Math.min(nums[i],Math.min(temp*nums[i],min*nums[i]));
            ans=Math.max(ans,max);
        }
        return ans;
    }
}