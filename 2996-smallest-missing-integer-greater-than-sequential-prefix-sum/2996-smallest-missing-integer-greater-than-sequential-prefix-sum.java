class Solution {
    public int missingInteger(int[] nums) {
      HashSet<Integer> s = new HashSet<>();
      for(int i:nums){
        s.add(i);
      }  
      int max=0;
      int sum=nums[0];

      for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1){
            sum=sum+nums[i];
        }else{
            break;
        }
        }
        while(s.contains(sum)){
            sum++;
        }
    
      
      return sum;
    }
}