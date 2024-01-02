package if_else;

import java.util.Scanner;

public class largeof3 {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();
        int c = q.nextInt();
        if (a >= b && c >= b) {
            System.out.print("A=");
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.print("B=");
            System.out.println(b);
        } else {
            System.out.print("C=");
            System.out.println(c);
        }

    }

}
