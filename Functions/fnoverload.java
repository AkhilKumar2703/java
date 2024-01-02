package Functions;

public class fnoverload {
    public static void main(String[] args) {
        fun("akhil");
        fun(55);

    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

}
