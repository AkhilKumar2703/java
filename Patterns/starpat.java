import java.util.Scanner;

public class starpat {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("N=");
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int sp = 1;
            while (sp <= n - i) {
                System.out.print(" ");
                sp = sp + 1;

            }
            int star = 1;
            while (star <= 2 * i - 1) {

                System.out.print('*');

                star = star + 1;

            }
            System.out.println();
            i = i + 1;
        }
    }
}