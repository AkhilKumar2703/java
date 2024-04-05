
class Solution {
    public int numberOfSteps(int num) {

        return help(num, 0);

    }

    private int help(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return help(num / 2, steps + 1);

        } else {

            return help(num - 1, steps + 1);
        }
    }
}