import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // to take input
        int ans = 0;
        while (true) {
            System.out.print("ENTER OPERATOR:");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("ENTER NUMBER 1: ");
                int num1 = in.nextInt();
                System.out.print("ENTER NUMBER 2: ");
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;

                }
                if (op == '-') {
                    ans = num1 - num2;

                }
                if (op == '*') {
                    ans = num1 * num2;

                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;

                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println("YOUR ANSWER IS: " + ans);
        }

    }

}
