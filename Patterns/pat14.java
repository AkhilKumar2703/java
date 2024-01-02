import java.util.Scanner;

public class pat14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 1;
            char c = (char) ('A' + i - 1);

            while (j <= i) {

                System.out.print(c);
                c = (char) (c + 1);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;

        }

    }
}