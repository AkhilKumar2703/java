
import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);
        int f = q.nextInt();
        // operators error
        // int cel = (5 / 9 * (f - 32));
        // operators logic 1
        // int cel = (5 * (f - 32) / 9);
        // operators logic 2 using operator
        int cel = (int) (5.0 / 9 * (f - 32));
        System.out.println(cel);

        System.out.println(9 + 5);
        System.out.println(9 - 5);
        System.out.println(9 * 5);
        System.out.println(9 / 5);
        System.out.println(9 % 5);
        System.out.println('m' / 5);
        System.out.println("hello");
        char P = 'm';
        int y = P;
        System.out.println(y);
        System.out.println('A' + 1);

        char h = 'z';
        char t = 'e' + 4;
        System.out.println(t);
        System.out.println(h);
        // writing char in brakets is optonal not mandatory
        char l = (char) ('c' + 5);
        System.out.println(l);
        System.out.println('b' / 2);

    }
}