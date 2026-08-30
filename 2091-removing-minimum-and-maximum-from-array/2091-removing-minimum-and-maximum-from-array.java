import java.util.*;

class Solution {
    public int minimumDeletions(int[] nums) {

        // Convert array to List
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        // Find min and max
        int min = Collections.min(list);
        int max = Collections.max(list);

        // Find their indexes
        int minIndex = list.indexOf(min);
        int maxIndex = list.indexOf(max);

        // Make minIndex smaller
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        int n = nums.length;

        // 3 possibilities:
        
        // 1. Remove both from left
        int left = maxIndex + 1;

        // 2. Remove both from right
        int right = n - minIndex;

        // 3. Remove min/max from left and other from right
        int both = (minIndex + 1) + (n - maxIndex);

        return Math.min(left, Math.min(right, both));
    }
}