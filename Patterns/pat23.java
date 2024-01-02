import java.util.Scanner;

public class pat23 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int N = p.nextInt();
        int fh = (N + 1) / 2;
        int sh = N / 2;
        // first half
        int i = 1;
        while (i <= fh) {
            int space = 1;
            while (space <= fh - i) {
                System.out.print(" ");
                space = space + 1;

            }
            int s = 1;
            while (s <= 2 * i - 1) {
                System.out.print("*");
                s = s + 1;
            }
            System.out.println();
            i = i + 1;
        }
        // second half
        int j = sh;
        while (j >= 1) {
            int space = 1;
            while (space <= sh - j + 1) {
                System.out.print(" ");
                space = space + 1;

            }
            int d = 1;
            while (d <= 2 * j - 1) {
                System.out.print("*");
                d = d + 1;

            }
            System.out.println();
            j = j - 1;
        }
    }
}