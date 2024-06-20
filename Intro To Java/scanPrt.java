import java.util.Scanner;

public class scanPrt {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        // Scanner name  = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int p = demo.nextInt();
       System.out.print( "Enter Rate : ");
        int r = demo.nextInt();
        System.out.print( "Enter Time : ");
        int t = demo.nextInt();
        System.out.print( "Simple Interst is : ");
        int si = (p*r*t)/100;
        System.out.println(si);

    }
}
