class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        for (int x = 1; x <= nums.length; x++) {
            int found = 0;
            int i = 0;
            int j = nums.length - 1;

            while (i <= j) {
                int mid = (i + j) / 2;

                if (x == nums[mid]) {
                    found = 1;
                    break;
                } else if (x < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }

            if (found == 0) {
                return x;
            }
        }

        return nums.length + 1;
    }
}