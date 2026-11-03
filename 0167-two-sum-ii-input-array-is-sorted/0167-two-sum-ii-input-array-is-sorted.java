class Solution {
    public int[] twoSum(int[] nums, int target) {
 int a[] = new int[2];
 int i=0;
 int j=nums.length-1;
 while(i<j){
    if(nums[i]+nums[j]==target){
        a[0]=i+1;
        a[1]=j+1;
        break;
    }else if (nums[i]+nums[j]<target){
        i++;
    }
    else{
        j--;
    }
 }return a;
    }
}