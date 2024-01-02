import java.util.Scanner;

public class ls {
    public static int ls(int arr[], int n, int val) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void printarray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + "  ");

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
    }
}
