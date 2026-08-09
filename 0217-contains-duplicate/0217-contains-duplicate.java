class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     HashMap<Integer,Integer> hm = new HashMap<>();
        
    //     for(int i=0;i<nums.length;i++){
    //       int  val=nums[i];
    //         if(hm.containsKey(val)){
    //             return true;
    //         }
    //         else{
    //             hm.put(val,1);
    //         }
            
    //     }
    //    return false; 
    HashSet<Integer> h = new HashSet<>();
    for(int i:nums){
        if(!h.contains(i)){
            h.add(i);
        }else{
            return true;
        }
    }
    return false;
    }
}