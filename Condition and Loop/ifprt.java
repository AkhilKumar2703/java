
import java.util.Scanner;

public class ifprt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int r = s.nextInt();
        int t = s.nextInt();
        int si = (p*r*t)/100;

        if(si>1000){
            
            if(si>4000){
                System.out.println("SI IS BEST "+si);
            }else{
                System.out.println("SI IS AVERAGE "+si );
            }
        }else{
            System.out.println("SI IS Worse "+si);
        }
    }
}
