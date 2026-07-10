class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       ArrayList<Integer> a = new ArrayList<>();
       double ans;
       for(int x:nums1){
        a.add(x);
       }
       for(int x :nums2){
        a.add(x);
       }
       Collections.sort(a);
       int i=0;
       int j=a.size()-1;
       while(i<j){
        i++;
        j--;
       }if(i==j){
        return a.get(i);
       }else{
  ans = (a.get(i) + a.get(j)) / 2.0;
       }
       return ans;
    }
}