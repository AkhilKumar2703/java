import java.util.Scanner;

public class break1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int d = 2;
        boolean di = false;
        while (d < num) {
            if (num % d == 0) {
                di = true;
                break;
            }
            d = d + 1;
        }
        if (di) {
            System.out.println("not prime");

        } else {
            System.out.println("prime");
        }
    }
}