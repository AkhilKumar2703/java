class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subset = new ArrayList<>();
        combi(1, n, new ArrayList<>(), subset, k);
        return subset;
    }

    static void combi(int start, int n, List<Integer> current, List<List<Integer>> subset, int k) {
        // base condition for k
        if (current.size() == k) {
            subset.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            // subset
            current.add(i);
            combi(i + 1, n, current, subset, k);
            // backtrak for new subset of different n values
            // basically the current list will get empty
            current.remove(current.size() - 1);
        }
    }
}