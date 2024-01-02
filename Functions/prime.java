package Functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int c = 2; c*c <= n; c++) {
            if (n % c == 0) {
                System.out.println("PRIME");
                return;
            }

        }
        System.out.println("not prime");
    }
}
