package Functions;

import java.util.Arrays;

// variable arguements
public class varArgs {

    public static void main(String[] args) {
        // fun(1, 2, 45, 56, 98, 78, 32, 1, 45, 78, 4);
        fun(1, 2, 45, 56, 98, 78, 32, 15, 45526, 45, 7, 8, 1);
        fun2(45, 55, "hello", "world");
        // eg(10, 50);

    }

    static void fun(int... v) // here we dont know how many inputs we are giving
    // only 3 dots
    {
        System.out.println(Arrays.toString(v));
        // System.out.println(v);
    }

    static void fun2(int a, int b, String... v) {
        // System.out.println(Arrays.toString(a, b));
        System.out.println(Arrays.toString(v));
    }

}

// tostrings ==> value coneverted into human readble string representation
