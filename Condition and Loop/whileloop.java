import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int s = t.nextInt();

        // initialize
        int i = 1;
        // eg s = 20 , i =0 -> 0,1,2,3,
        while (i <= s) {

            System.out.print(i+" ");
            i++;
           // i = i + 1;
        }

    }

}
