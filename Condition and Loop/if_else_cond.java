// if else condition code 

import java.util.Scanner;

public class if_else_cond {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int rem = a % 2;
        if (rem == 0) {
            System.out.println("NO Is EVEN");
            return;
        } else {
            System.out.println("NO IS ODD");
        }
        // System.out.println("NO IS ODD");

    }

}