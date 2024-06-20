import java.util.Scanner;

//sum of even numbers till N
public class evennotoN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("N=");

        int N = s.nextInt();


        int sum = 0;
        int i = 1;
        while (i <= N) {
            if(i%2==1){
                System.out.print(i +" ");
                sum = sum + i;
            }
            i = i + 1;
            
        }
        System.out.println("sum=" + sum);
    }
}
