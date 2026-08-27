class Solution {
    public int[] twoSum(int[] nums, int target) {
    int ans[]=new int[2];
    HashMap <Integer,Integer> h= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int component=target-nums[i];
        if(h.containsKey(component)){
            ans[0]=h.get(component);
            ans[1]=i;
        }
            h.put(nums[i],i);
        
    }
        return ans;
    }
}