import java.util.Scanner;

public class countingOccr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER NUMBER: ");
        int num = scan.nextInt();
        System.out.print("ENTER VALUE TO CHECK :");
        int occur = scan.nextInt();
        // count will incrememt whenwver the value will occur
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == occur) {
                count++;
            }
            num = num / 10; // divide
        }
        System.out.println("OCCURED VALUE IS " + count + " TIMES");
    }
}

// given number - 12334 , check 3
// 12334 % 10 = 4
// num /10 = 1223
// 1223 % 10 = 3 (count ++)
// num /10 =122
// num 1 % 10
// count = output