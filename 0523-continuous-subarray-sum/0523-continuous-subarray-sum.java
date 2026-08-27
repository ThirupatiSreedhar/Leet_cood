class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    
        // for(int i=0;i<nums.length;i++){
        //   int sum=nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         sum=sum+nums[j];
             
        //         if(sum%k==0){
        //             return true;
        //         }
              
        //     }
           
        // }
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,-1);
        int psum=0;
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
            int rem = psum%k;
            if(h.containsKey(rem)){
                if(i-h.get(rem)>=2){
                    return true;
                }
            }
            else{
                    h.put(rem,i);
                }
        }
         return false;
    }
}