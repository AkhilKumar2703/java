package Functions;

public class swapfnc {

    public static void main(String[] args) {
        String name = "DAVID";
        System.out.println(greet(name));
    }

    static String greet(String name) {
        name = "ANDY";
        return name;

    }
}
// HERE ONLY THE REFERENCE VALUES ARE BIENG COPIED NOT THE VALUES ARE BEING
// SWAPPED