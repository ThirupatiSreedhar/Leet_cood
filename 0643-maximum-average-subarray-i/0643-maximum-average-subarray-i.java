class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double avg = (double) sum / k;
        double max = avg;

        int i = 0;
        int j = k - 1;

        while (j < nums.length - 1) {
            sum -= nums[i];
            i++;
            j++;
            sum += nums[j];

            avg = (double) sum / k;
            max = Math.max(max, avg);
        }

        return max;
    }
}