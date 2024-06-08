import java.util.Random;
import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i = i + 1) { // i++
            System.out.println(i);
            sum = sum + i; // 1+2+3+4+5+6+7+8+9+10 =55
        }
        System.out.println(sum);
    }

}
