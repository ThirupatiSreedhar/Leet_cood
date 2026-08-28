class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    //     int count=0;
        
    //    for(int i=0;i<nums.length;i++){
    //     int sum=nums[i];
    //     if(sum%k==0){
    //         count++;
    //     }
    //     for(int j=i+1;j<nums.length;j++){
    //         sum=sum+nums[j];
    //         if(sum%k==0){
    //             count++;
    //         }
    //     }
        
    //    } 
    //    return count;
    HashMap<Integer,Integer> h = new HashMap<>();
    h.put(0,1);
    int count=0;
    int psum=0;
    for(int num:nums){
        psum=psum+num;
        int rem = psum%k;
        if(rem<0){
            rem=rem+k;
        }
        if(h.containsKey(rem)){
            count+=h.get(rem);
        }
    h.put(rem,h.getOrDefault(rem,0)+1);
    }
    return count;
    }
}