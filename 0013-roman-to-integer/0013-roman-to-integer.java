class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 'I') {
                if (i + 1 < a.length && (a[i + 1] == 'V' || a[i + 1] == 'X')) {
                    sum = sum - 1;
                } else {
                    sum = sum + 1;
                }

            } else if (a[i] == 'V') {
                sum = sum + 5;

            } else if (a[i] == 'X') {
                if (i + 1 < a.length && (a[i + 1] == 'L' || a[i + 1] == 'C')) {
                    sum = sum - 10;
                } else {
                    sum = sum + 10;
                }

            } else if (a[i] == 'L') {
                sum = sum + 50;

            } else if (a[i] == 'C') {
                if (i + 1 < a.length && (a[i + 1] == 'D' || a[i + 1] == 'M')) {
                    sum = sum - 100;
                } else {
                    sum = sum + 100;
                }

            } else if (a[i] == 'D') {
                sum = sum + 500;

            } else if (a[i] == 'M') {
                sum = sum + 1000;
            }
        }

        return sum;
    }
}