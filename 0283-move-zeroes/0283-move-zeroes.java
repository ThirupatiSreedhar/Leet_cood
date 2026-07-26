class Solution {
    public void moveZeroes(int[] nums) {
    //     int j=0;
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]!=0){
    //         int temp = nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //         j++;
    //     }
    //    } 
    int i=0;
    for(int x :nums){
        if(x != 0){
            nums[i]=x;
            i++;
        }
    }
    while(i<nums.length){
        nums[i]=0;
        i++;
    }
    }
}