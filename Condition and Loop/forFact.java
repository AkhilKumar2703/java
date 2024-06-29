public class forFact {
    public static void main(String[] args) {

        int n = 10;
        for (int i = 1; i <= n; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) { // particular i th index -> factorial
                factorial *= j;
            }
            System.out.println("Factorial of " + i + " is " + factorial);
        }
    }

}
// i = 10 ->>
