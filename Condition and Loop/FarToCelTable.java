import java.util.Scanner;

// farheniet to celcius table
public class FarToCelTable {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Start Farheniet Value= ");
        int S = q.nextInt();
        System.out.print("End Farheniet Value= ");
        int E = q.nextInt();
        System.out.print("Step Size= ");
        int W = q.nextInt();
        int f = S;
        System.out.println("F" + "\t" + "C");
        while (f <= E) {
            int c = (int) (5.0 / 9 * (f - 32));

            System.out.println(f + "\t" + c);
            f = f + W;

        }
    }

}
