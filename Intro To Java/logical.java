import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();
        int c = q.nextInt();

        boolean and = (a > b) && (a > c);
        System.out.println("IS a GREATER THAN BOTH b & c   " + and);
        boolean or = (a > b) || (a > c);
        System.out.println("IS a GREATER THAN ANY ONE OF b & c   " + or);
        System.out.println("a IS NOT GREATER THAN b  " + !(a > b));

    }

}
