import java.util.*;

public class lsarr {
    public static void main(String[] args) {
        int[] arr = { 15, 27, 29, 8, 56, 48, 36 };
        int target = 567;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // int element = arr[index];
            if (arr[index] == target) {
                return arr[index];

            }

        }
        return -1;
    }
}