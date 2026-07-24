class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
       long sum =0;
       long max=0;
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        if(i>=k){
            sum=sum-nums[i-k];
            h.put(nums[i-k],h.get(nums[i-k])-1);
            if(h.get(nums[i-k])==0){
                h.remove(nums[i-k]);
            }
        }
        if(i>=k-1&&h.size()==k){
            max=Math.max(sum,max);
        }
       }
       return max;
    }
}