import java.util.Scanner;

//sum of even numbers till N
public class evennotoN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N=");
        int N = s.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= N) {
            i = i + 2;
            sum = sum + i;
        }
        System.out.println("sum=" + sum);
    }
}
