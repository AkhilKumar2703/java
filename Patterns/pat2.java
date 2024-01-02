
import java.util.Scanner;

public class pat2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int v = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {

                System.out.print(v);
                v = v + 1;
                j = j + 1;

            }
            System.out.println();
            i = i + 1;
        }
    }

}
