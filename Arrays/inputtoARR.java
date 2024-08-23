package Arrays;
import  java.util.*;

public class inputtoARR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // here we can use(n) in replace of arr.length to define
        // size
System.out.print("Enter the size of array : ");
int n = s.nextInt();
        int arr[] = new int[n]; // if we use n then 5 will not be used



        for (int i = 0; i < arr.length; i++) {
           // System.out.println("ELEMENT AT " + i + "th INDEX");
            arr[i] = s.nextInt();

        }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(Arr[i] +" ");
        // for (int num : arr) {
        //     System.out.print(num + " ");

        // }
         System.out.println("Given array : "+Arrays.toString(arr));
    }
}