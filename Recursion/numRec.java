package Recursion;

public class numRec {
    public static void main(String[] args) {
        print(1);

    }

    // using recursive approach
    static void print(int n) {
        // BASE CONDITION

        if (n == 5) {
            System.err.println(n);
            return;
        }

        System.out.println(n);
        // RECURSIVE CALL
        // EVERY TIME IT IS TAKING SPACE IN STACK MEMORY
        print(n + 1);

    }
}
