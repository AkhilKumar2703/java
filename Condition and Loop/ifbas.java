
import java.util.Scanner;

public class ifbas {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
       // int num = check.nextInt();


        int a = check.nextInt();
        int b = check.nextInt();

        // condition  if(condition){}
        // if(num%2==0){
        //     System.out.println("No is even !!");
        // }else{
        //     System.out.println("No is odd !!");
        // }



        if(a>b){
            System.out.println(a+" is bigger !!");
        }else{
            System.out.println(b+" is bigger !!");
        }
    }
}

