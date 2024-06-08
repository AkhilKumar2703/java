import java.util.Scanner;

// f to cel converter
public class ftoc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        // int cel = (5 / 9 * (f - 32)); // 0.45
        int cel = (5 * (f - 32) / 9);
        System.out.println("TEMPERATURE IN CELSIUS : " + cel);

    }
}
