https://leetcode.com/problems/single-number-ii/
class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        int unique2 = 0;
        for (int n : nums) {
            unique = (unique ^ n) & (~unique2);
            unique2 = (unique2 ^ n) & (~unique);

        }

        return unique;

    }
}