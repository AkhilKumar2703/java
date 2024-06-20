import java.util.Arrays;

public class arrswap {
    public static void main(String[] args) {

        int[] arr = { 11, 25, 36, 4, 5 };
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }

    // swap function
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
