import java.util.Scanner;

public class pat21 {
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
            while (s <= i) {
                System.out.print("*");
                s = s + 1;
            }
            int d = 1;
            while (d <= i - 1) {
                System.out.print("*");
                d = d + 1;
            }

            System.out.println();
            i = i + 1;

        }
    }
}
