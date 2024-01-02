import java.util.Scanner;

public class pat6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;

        while (i <= N) {
            int v = i;
            int j = 1;
            while (j <= i) {
                System.out.print(v);
                j = j + 1;
                v = v + 1;

            }
            System.out.println();
            i = i + 1;

        }
    }
}