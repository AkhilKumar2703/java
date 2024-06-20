public class lc367 {
    // ques 367
    public static void main(String[] args) {
        int check = 13;
        System.out.println(isPerfectSquare(check));

    }

    static boolean isPerfectSquare(int num) {
        // if (num == 1) {
        // return true;

        // }
        int start = 1;
        int end = num / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;
            if (sq == num) {
                return true;
            } else if (sq > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return false;

    }
}
