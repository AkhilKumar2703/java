import java.util.Scanner;

public class pat15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while (i <= N) {
            char c = (char) ('A' + N - i);
            int j = 1;
            while (j <= i) {
                System.out.print((char) (c + j - 1));
                j = j + 1;
            }
            System.out.println();
            i = i + 1;

        }

    }
}