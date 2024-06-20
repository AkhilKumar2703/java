public class revInt {
    public static void main(String[] args) {
        int check = rev(159378);
        System.out.println("reversed number is : " + check);

    }

    static int rev(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
        }

        return (ans);
    }
}
// LEETCODE QUESTION NUMBER 7