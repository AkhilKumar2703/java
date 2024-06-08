// if else condition code 

import java.util.Scanner;

public class if_else_cond {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int rem = a % 2; // remainder
        if (rem == 0) { // if(condition){ if condition is true then or if it is not then}
            System.out.println("NO Is EVEN");
            return;
        } else { // else{}
            System.out.println("NO IS ODD");
        }
        // System.out.println("NO IS ODD");

    }

}