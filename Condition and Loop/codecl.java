import java.util.Scanner;

public class codecl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER NUMBER 1: ");
        int num1 = in.nextInt();
        System.out.print("ENTER NUMBER 2: ");
        int num2 = in.nextInt();
        System.out.print("ENTER OPERATOR: ");
        String str = in.nextLine();
        char op = str.charAt(0);
        int ans;
        if (op = '+') {
            ans = num1 + num2;
            System.out.println("THE ADDITION OF " + num1 + " and " + num2 + " = " + ans);
        } else if (op = '-') {
            ans = num1 - num2;
            System.out.println("THE SUBTRACTION OF " + num1 + " and " + num2 + " = " + ans);
        } else if (op = '*') {
            ans = num1 * num2;
            System.out.println("THE MULTIPLICATION OF " + num1 + " and " + num2 + " = " + ans);
        } else {
            ans = num1 / num2;
            System.out.println("THE DIVISION OF " + num1 + " and " + num2 + " = " + ans);
        }

    }
}
