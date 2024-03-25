package Recursion;

public class roBS {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 7;
        System.out.println(bs(arr, target, 0, arr.length));

    }

    static int bs(int[] arr, int target, int s, int e) {

        if (s > e)
            return -1;

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] >= arr[s]) {
            if (target >= arr[s] && target <= arr[m]) {
                return bs(arr, target, s, m - 1);

            }
            return bs(arr, target, m + 1, e);

        }

        if (target >= arr[m] && target <= arr[e]) {

            return bs(arr, target, m + 1, e);

        }
        return bs(arr, target, s, m - 1);

    }
}
