package Functions;

public class twoton {
    // make function to check whether the functionis prime
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
            boolean prime = isprime(i); // initiate var and then call fun
            if (prime) {
                System.out.println(i);
            }
        }
    }

    // 9 ==
    public static void main(String[] args) {
        printpr(100);
        System.out.println();
    }
}