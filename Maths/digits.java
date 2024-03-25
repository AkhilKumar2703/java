package Maths;

import java.util.Scanner;

// TO FIND THE NUMBER OF DIGITS 
public class digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO CONVERT : ");

        int n = s.nextInt();
        System.out.print("ENTER THE BASE TO WHICH  CONVERT : ");
        int b = s.nextInt();
        int ans = (int) (Math.log(n) + Math.log(b));
        System.out.println("NUMBER OF DIGITS : " + ans);

    }
}
