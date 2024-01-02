package LEETCODE;

public class lc1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int ans = Integer.MIN_VALUE;
            // person = row
            // account = column
            for (int person = 0; person < accounts.length; person++) {
                int sum = 0;
                for (int account = 0; account < accounts[person].length; account++) {
                    sum += accounts[person][account];
                }
                // for overall answer
                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;

        }
    }
}
