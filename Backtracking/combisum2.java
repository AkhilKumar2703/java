class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        combi(0, ans, new ArrayList<>(), nums, target);
        return ans;
    }

    static void combi(int start, List<List<Integer>> ans, List<Integer> temp, int[] nums, int remain) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            ans.add(new ArrayList<>(temp));
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            } else {
                temp.add(nums[i]);
                combi(i + 1, ans, temp, nums, remain - nums[i]); // no duplicate
                temp.remove(temp.size() - 1);
            }
        }
    }
}