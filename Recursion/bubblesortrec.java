package Recursion;

import java.util.Arrays;

public class bubblesortrec {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 67, 83, 99 };
        bsr(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bsr(int[] arr, int r, int c) {
        if (r == 0) {
            return;

        }

        if (r > c) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bsr(arr, r, c + 1);
        } else {
            bsr(arr, r - 1, 0);
        }
    }
}
