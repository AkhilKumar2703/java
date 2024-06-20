import java.util.Scanner;

//to check whether the number  is prime using while loop
public class primewhile {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("GIVEN NO. =");
        int num = e.nextInt();
        int i = 2;
        while (i <= num - 1) {
            if (num % i == 0) {
                System.out.println("NOT A PRIME NUMBER ");
                return;
            }
            i = i + 1;

        }
        System.out.println("NUMBER IS PRIME ");

    }

}
