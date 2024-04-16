package OOPS.ExceptionHandling;

public class check {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("program finished");
        }
    }

    static int divide(int a, int b) {
        if(b==0) throw ArithmeticException("not zero")
        return a / b;
    }

}
