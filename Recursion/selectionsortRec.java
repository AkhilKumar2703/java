package Recursion;

import java.util.Arrays;

public class selectionsortRec {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 67, 83, 99 };
        ssr(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void ssr(int[] arr, int r, int c, int m) {
        if (r == 0)
            return;

        if (r > c) {
            if (arr[c] > arr[m]) {
                ssr(arr, r, c + 1, c);
            } else {
                ssr(arr, r, c + 1, m);
            }

        } else {
            int temp = arr[m];
            arr[m] = arr[r - 1];
            arr[r - 1] = temp;
            ssr(arr, r - 1, 0, 0);

        }
    }
}
