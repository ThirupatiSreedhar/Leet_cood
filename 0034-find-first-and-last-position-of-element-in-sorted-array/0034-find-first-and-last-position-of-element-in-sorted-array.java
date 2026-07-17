class Solution {
    public int[] searchRange(int[] nums, int target) {
       
       int left =-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid = (i+(j-i)/2);
            if(target==nums[mid]){
                left=mid;
                j=mid-1;
            }else if (target<nums[mid]){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        int right=-1;
           i=0;
         j=nums.length-1;
        while(i<=j){
            int mid = (i+(j-i)/2);
            if(target==nums[mid]){
                right=mid;
                i=mid+1;
            }else if (target<nums[mid]){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
      int a[]= new int[2];
      a[0]=left;
        a[1]=right;
        return a;
    }
}