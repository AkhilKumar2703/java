

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("ENTER THE SCORE OF SUBEJCT=");
        int marks = t.nextInt();

        if (marks >= 40) {
            
            if (marks >= 90) {
                System.out.println("HE/SHE IS ONE OF THE TOPPER ");

            }else{
            System.out.println("STUDENT GOT PASSING MARKS");
            }

        }
        else
         {
            System.out.println("Fail ");
        }

    }
}
// exam 100 - 33 pass - pass - 90 topper
// if(var > 30){ student pass if{}}