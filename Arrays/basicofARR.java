
import java.util.*;

public class basicofARR {
    public static void main(String[] args) {
        // datatype[] name = new datatype[n];

        int[] arr = new int[5];
        // name[index]= abl;
       
        arr[0] = 10;
        arr[1] = 88;
        arr[2] = 99;
        arr[3] = 45;
        arr[4] = 83;

        arr[1]=55;

         System.out.println(Arrays.toString(arr));

        // arr[1] = 68;
        // System.out.println(Arrays.toString(arr));

        // int[] abc = { 1, 88, 6, 87, 99 };
        // abc[1] = 77;
        // System.out.println(Arrays.toString(abc));


        // String [] str = {"helo","world"};
        // str[0]="hello";

        // System.out.println((arr[0]));

        // // indexing and inserting values(updation)
        // System.out.println(arr[0]);
        // System.out.println(arr[6]);
        // // these arraysbelow are errors beacuse the are out of bound length
        // // arr[-1] = 65;
        // // arr[10]=43;
        // System.out.println(arr[8]); // it will give output of zero as we have not
        // defined the value
        // char[] akki = new char[10];
        // double[] lg = new double[10];
        // System.out.println(akki[0]);
        // System.out.println(lg[0]);
        // boolean[] a = new boolean[10];
        // System.out.println(a[0]); // it will give output false as we have not defined
        // the value

    }
}