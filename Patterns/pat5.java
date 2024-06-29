import java.util.Scanner;

public class pat5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print(N - j );
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }

    }
}
