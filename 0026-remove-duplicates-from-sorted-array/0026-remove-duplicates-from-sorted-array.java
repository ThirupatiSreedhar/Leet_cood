class Solution {
    public int removeDuplicates(int[] nums) {
    //     HashMap<Integer,Integer> h = new HashMap<>();
    //    int k =0;
    //    for(int x :nums){
    //     if(!h.containsKey(x)){
    //         h.put(x,1);
    //         nums[k]=x;
    //         k++;
    //    }
    //    }
    int k=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[k-1]){
            nums[k]=nums[i];
            k++;
        }
    }
       return k;
    }
}