package Recursion;

public class fact {
    public static void main(String[] args) {
        int ans = fact(5);
        System.err.println(ans);

    }

    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
}
