package if_else;

import java.util.Scanner;

public class largeof3 {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();
        int c = q.nextInt();

        int max = Math.max(c, Math.max(a, b));
        int min = Math.min(c, Math.min(a, b));

        int sq = (int) Math.sqrt(9);
        System.out.println("SQUAREROOT IS:" + sq);

        System.out.println("MAXIMUM :" + max);
        System.out.println("MINIMUM :" + min);

    }
    // math.operation

}
