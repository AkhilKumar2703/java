package if_else;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("ENTER THE SCORE OF SUBEJCT=");
        int a = t.nextInt();
        if (a >= 40) {
            System.out.println("STUDENT GOT PASSING MARKS");
            if (a >= 90) {
                System.out.println("HE IS ONE OF THE TOPPER ");

            }

        }
        if (a < 35) {
            System.out.println("Fail ");
        }

    }
}
// exam 100 - 33 pass - pass - 90 topper
// if(var > 30){ student pass if{}}