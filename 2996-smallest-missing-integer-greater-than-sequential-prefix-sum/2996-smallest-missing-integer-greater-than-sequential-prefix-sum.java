class Solution {
    public int missingInteger(int[] nums) {
      HashSet<Integer> s = new HashSet<>();
      for(int i:nums){
        s.add(i);
      }  
      int max=0;
      int sum=nums[0];

      for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1){//2==0+1=2,3==2-1+1=3,2==4 false
            sum=sum+nums[i];//1+2=3+3=6
        }else{
            break;
        }
        }
        while(s.contains(sum)){ //true 7 false
            sum++;// break the loop 6++ 7
        }
    
      
      return sum;//6
    }
}