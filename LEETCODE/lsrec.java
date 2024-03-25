public class lsrec {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        System.out.println(ls2(arr, target, 0));

    }

    // to check wether it is present or not
    static boolean ls(int[] arr, int target, int index) {
        if (arr[index] == arr.length)
            return false;

        return arr[index] == target || ls(arr, target, index + 1);
    }

    // to finde index
    static int ls2(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;

        if (arr[index] == target) {
            return index;

        } else {
            return ls2(arr, target, index + 1);
        }

    }
}
