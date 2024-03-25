package Recursion;

import java.util.Arrays;

public class qiucksort {
    public static void main(String[] args) {
        int[] arr = { 12, 55, 77, 64, 83, 45, 91, 67 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quick(int[] arr, int low, int hi) {

        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;

            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }
        quick(arr, low, e);
        quick(arr, s, hi);
    }
}
