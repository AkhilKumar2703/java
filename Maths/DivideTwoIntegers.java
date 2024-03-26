class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = (divisor >= 0) == (dividend >= 0) ? 1 : -1;
        int res = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        // this loop basically will work till dividend - divisor >=0
        while (dividend - divisor >= 0) {
            int temp = divisor;
            int count = 1;
            // this loop will basically count the number of left shifts values
            while (dividend - (temp << 1) >= 0) {
                temp <<= 1;

                count <<= 1;
            }
            res = res + count;
            dividend -= temp;
        }
        return res * sign;

    }
}