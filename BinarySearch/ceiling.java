package BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = { 45, 51, 89, 99 };
        int target = 48;
        int ans = ceiling(arr, target);
        System.err.println(ans);

    }

    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
