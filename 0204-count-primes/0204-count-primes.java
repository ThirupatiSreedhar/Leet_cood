class Solution {
    public int countPrimes(int num) {
        if (num <= 2) {
            return 0;
        }

        int[] a = new int[num];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i * i < num; i++) {
            if (a[i] == 0) {
                for (int j = i * i; j < num; j += i) {
                    a[j] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < num; i++) {
            if (a[i] == 0) {
                count++;
            }
        }

        return count;
    }
}