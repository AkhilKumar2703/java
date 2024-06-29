
import java.util.Scanner;

public class pat1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int i = 1;
        // while (i <= n) {
        //     int j = 1;
        //     while (j <= i) {

        //         System.out.print(j);
        //         j = j + 1;

        //     }
        //     System.out.println();
        //     i = i + 1;
        //}
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);

            }
            System.out.println();
      
        }
    }

}
