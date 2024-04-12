package OOPS.Compare;

public class Main extends A {
    public static void main(String[] args) {
        A akhil = new A(11, 83.43f);
        A kunal = new A(19, 93.59f);

        if (akhil.compareTo(kunal) < 0) {
            System.out.println("kunal is greater");
        }

    }
}
