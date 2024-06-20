package LEETCODE;

public class lc1672 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 15, 16 },
                { 7, 8, 9 }
        };
        System.out.println(maximumWealth(arr));

    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        // int demo = Integer.MIN_VALUE;
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
