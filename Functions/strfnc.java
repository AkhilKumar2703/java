package Functions;

public class strfnc {

    public static void main(String[] args) {
        String mssge = greet();
        System.out.println(mssge);
        int ans = sum(99, 1);
        System.out.println(ans);

    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static String greet() {
        String greeting = "hANJI Kya Haal";
        return greeting;
    }

}
