import java.util.Scanner;

public class largethree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER : ");
        int numOne = scan.nextInt();
        System.out.print("ENTER FIRST SECOND : ");
        int numTwo = scan.nextInt();
        System.out.print("ENTER FIRST THIRD : ");
        int numThree = scan.nextInt();

        if (numOne > numTwo && numOne > numThree) {
            System.out.println("Number ONE is greatest");
        } else if (numTwo > numThree && numTwo > numOne) {
            System.out.println("Number TWO is greatest");
        } else {
            System.out.println("Number THREE is greatest");
        }

    }
}
