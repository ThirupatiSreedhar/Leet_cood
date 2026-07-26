class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
     Set<List<Integer>> h = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[j]);
                     t.add(nums[k]); 
                     h.add(t);

                     j++;
                     k--;
                }
               else if(nums[i]+nums[j]+nums[k]<0){
                j++;
               }
               else{
                k--;
               }
            }
        }
        return new ArrayList<>(h);
    }
}