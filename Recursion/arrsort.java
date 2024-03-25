package Recursion;

public class arrsort {
    // TO CHECK IF THE ARRAY IS SORTED OR NOT
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 10, 8, 9 };
        System.out.println(sort(arr, 0));

    }

    static boolean sort(int[] arr, int i) {
        if (arr[i] == arr.length - 1)
            return true;
        return arr[i] < arr[i + 1] && sort(arr, i + 1);
    }
}
