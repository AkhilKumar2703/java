package Functions;

import java.util.Scanner;

public class ncr {
    // we made a funtion of factorial
    public static int factorial(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int num = factorial(n);
        int dec1 = factorial(r);
        int dec2 = factorial(n - r);
        int sum = num / (dec1 * dec2);
        System.out.println("REQUIRED COMBINATION IS= " + sum);
    }
}