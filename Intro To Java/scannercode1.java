import java.util.Scanner;

public class scannercode1 {

    // simple interest using scanner

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        System.out.println(str);
        char a = str.charAt(0);
        System.out.println(a);

        System.out.print("ENTER YOUR PRINCIPAL VALUE: ");
        // scanner syntex
        int P = s.nextInt();
        System.out.print("ENTER YOUR RATE VALUE: ");
        int R = s.nextInt();
        System.out.print("ENTER YOUR TIME VALUE: ");
        int T = s.nextInt();
        System.out.print("YOUR SIMPLE INTEREST IS: ");
        int SI = (P * R * T / 100);
        System.out.println(SI);

    }

}
