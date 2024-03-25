package Recursion;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = { 12, 88, 45, 66, 11, 16 };
        System.out.println(Arrays.toString(ms(arr)));

    }

    static int[] ms(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int m = arr.length / 2;

        int[] left = ms(Arrays.copyOfRange(arr, 0, m));
        int[] right = ms(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {

                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;

            }
            k++;
        }
        // if the arrays have different length and one goes out of bounds then
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;

        }
        return mix;

    }

}
