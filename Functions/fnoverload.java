package Functions;

public class fnoverload {
    public static void main(String[] args) {

        fun("akhil");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static double fun(double a, double b) {
        double res = (double) a + b;
        return res;
    }

    static int fun(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int fun(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

}
