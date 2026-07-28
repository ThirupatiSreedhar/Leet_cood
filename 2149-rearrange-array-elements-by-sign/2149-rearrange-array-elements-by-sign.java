class Solution {
    public int[] rearrangeArray(int[] nums) {
    int p[]= new int[nums.length/2];
    int n[]=new int[nums.length/2];
    int pi=0;
    int ni=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            p[pi]=nums[i];
            pi++;
        
        }else{
            n[ni]=nums[i];
            ni++;

        }
    }  
    int j=0;
    for(int i=0;i<=p.length-1;i++){
        nums[j]=p[i];
        j++;
        nums[j]=n[i];
        j++;
    }  
    return nums;
    }
}