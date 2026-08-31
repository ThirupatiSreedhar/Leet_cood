class Solution {
    public int searchInsert(int[] nums, int target) {
    //    for(int i=0;i<nums.length;i++){
    //     if(target==nums[i]){
    //         return i;
    //     }else if(nums[i]>target){
    //         return i;
    //     }
    //    } 
    //    return nums.length;
    int low = 0;
    int high = nums.length-1;
    while(low<=high){
        int mid = low+(high-low)/2;
        if(target==nums[mid]){
            return mid;
        }else if (target<nums[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return low;
    }
}