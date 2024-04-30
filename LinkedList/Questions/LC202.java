class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));

        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;

    }

    // square fucntion
    private int square(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = ans + rem * rem;
            num = num / 10;

        }
        return ans;
    }
}