package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 6, 4, 2, 0 };
        bubble(arr);
        System.err.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            // we added swap just to reduce time complexity
            // as if arrays is already sorted then it means
            // we do not need to swap
            swapped = false;

            // now after every pass max elements will be at last

            for (int j = 1; j < arr.length - i; j++) {
                // swap the elements if the element is bigger than the next element
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }

            }
            if (!swapped) {
                break;
            }

        }

    }

}
