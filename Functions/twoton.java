package Functions;

public class twoton {
    public static boolean isprime(int n) {
        for (int d = 2; d < n; d++) {
            if (n % d == 0) {
                return false;

            }

        }
        return true;

    }

    public static void printpr(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isprime = isprime(i);
            if (isprime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printpr(100);
        System.out.println();
    }
}