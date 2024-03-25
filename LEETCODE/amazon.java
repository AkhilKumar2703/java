import java.util.Scanner;

public class amazon {
    public static void main(String[] args) {
        System.out.print("ENTER THE VALUE OF N : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans = ans + (last * base);
            base = base * 5;

        }
        System.out.println(ans);

    }

}
