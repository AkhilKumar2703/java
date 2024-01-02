import java.util.Scanner;

public class pat22 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int N = p.nextInt();
        int i = 1;
        while (i <= N) {
            int space = 1;
            while (space <= N - i) {
                System.out.print(" ");
                space = space + 1;

            }
            int s = 1;
            int v = i;
            while (s <= i) {
                System.out.print(v);
                s = s + 1;
                v = v + 1;
            }
            int d = 1;
            int f = 2 * i - 2;
            while (d <= i - 1) {
                System.out.print(f);
                f = f - 1;
                d = d + 1;

            }

            System.out.println();
            i = i + 1;

        }
    }
}
