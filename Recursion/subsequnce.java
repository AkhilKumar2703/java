package Recursion;

public class subsequnce {
    public static void main(String[] args) {
        subsequnce(" ", "abc");

    }

    static void subsequnce(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p);
            return;
        }
        char c = up.charAt(0);
        subsequnce(p + c, up.substring(1));
        subsequnce(p, up.substring(1));

    }
}
