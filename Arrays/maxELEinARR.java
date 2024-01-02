
// TO FIND THE LARGEST ELEMENT IN ARRAY
import java.util.Scanner;

public class maxELEinARR {
    public static int largestinarr(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void printarray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + "  ");

        }
    }

    public static int[] takeinput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ELEMENT AT " + i + "th INDEX");
            arr[i] = s.nextInt();

        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[] = takeinput();

        printarray(arr);
        int largest = largestinarr(arr);
        System.out.println("LARGEST = " + largest);
    }

}
