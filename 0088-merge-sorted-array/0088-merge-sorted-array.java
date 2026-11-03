class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //   ArrayList<Integer> al = new ArrayList<>();
    //   for(int i=0;i<m;i++){
    //     al.add(nums1[i]);
    //   }  for(int j=0;j<n;j++){
    //     al.add(nums2[j]);
    //   }
    //   Collections.sort(al);
    //   for (int i = 0; i < m + n; i++) {
    //         nums1[i] = al.get(i);
    //     }
    int a[] = new int[m];
    for(int i=0;i<m;i++){
        a[i]=nums1[i];
    }
    int i=0;
    int j=0;
    int k=0;
    while (i < m && j < n) {

            if (a[i] <= nums2[j]) {
                nums1[k] = a[i];
                i++;
                k++;
            } else {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            nums1[k] = a[i];
            i++;
            k++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}