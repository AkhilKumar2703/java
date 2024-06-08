import java.util.Scanner;

public class relationaloperators {

    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        int a = g.nextInt();
        int b = g.nextInt();

        // boolean p = (a == b);
        // boolean l = (a > b);
        // boolean m = (a != b);
        // boolean n = (a >= b);
        // boolean k = (a < b);
        // boolean o = (a <= b);
        boolean as = (a == b); // compare two values
        boolean ww = (a != b); // not equal to
        // <,> (greater than and equal to)
        // >=

        System.out.println("IS EQUAL " + p);
        System.out.println("IS GREATER " + l);
        System.out.println("IS NOT EQUAL " + m);
        System.out.println("IS GREATER THNA EQUAL TO " + n);
        System.out.println("IF LESS THAN " + k);
        System.out.println("IS LESS THAN EQUAL TO " + o);

    }
}
