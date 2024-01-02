import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        char b = A.charAt(0);
        System.out.println(b);

        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int av = ((m1 + m2 + m3) / 3);
        char C = A.charAt(0);
        System.out.println(C);

        System.out.println(av);

    }
}
