package Recursion;

public class skipstr {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip2("baccad"));

    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if (c == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + c, up.substring(1));
        }
    }

    static String skip2(String up) {
        if (up.isEmpty()) {

            return "";
        }
        char c = up.charAt(0);
        if (c == 'a') {
            return skip2(up.substring(1));
        } else {
            return c + skip2(up.substring(1));
        }
    }
}
