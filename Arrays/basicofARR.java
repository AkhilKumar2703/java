package Arrays;

public class basicofARR {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[6] = 88;
        arr[0] = 99;
        // indexing and inserting values(updation)
        System.out.println(arr[0]);
        System.out.println(arr[6]);
        // these arraysbelow are errors beacuse the are out of bound length
        // arr[-1] = 65;
        // arr[10]=43;
        System.out.println(arr[8]); // it will give output of zero as we have not defined the value
        char[] akki = new char[10];
        double[] lg = new double[10];
        System.out.println(akki[0]);
        System.out.println(lg[0]);
        boolean[] a = new boolean[10];
        System.out.println(a[0]); // it will give output false as we have not defined the value

    }
}