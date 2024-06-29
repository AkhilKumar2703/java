package BinarySearch;

public class binSrch {
    public static void main(String[] args) {
        int[] arr = { -12, 0, 1, 2, 3, 23, 29, 31, 45, 56, 89, 99, };
        int target = 39;
        int ans = binarySearch(arr, target);
        System.err.println(ans);

    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2; // (start+ end) / 2
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
