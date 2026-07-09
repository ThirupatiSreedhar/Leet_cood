class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int x : nums) {
            hs.add(x);
        }

        ArrayList<Integer> a = new ArrayList<>(hs);
        Collections.sort(a);

        int n = a.size();

        if (n >= 3) {
            return a.get(n - 3);
        } else {
            return a.get(n - 1);
        }
    }
}