package BinarySearch;

import java.util.*;

public class bs2d {

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        String ans = Arrays.toString(BinSrch2D(arr, 37));
        System.out.println(ans);
        // System.out.println(Arrays.toString(BinSrch2D(arr, 37)));

    }

    static int[] BinSrch2D(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            } else if (arr[r][c] > target) {
                c--;
            } else {
                r++;// it means row index (i) increasing
            }
        }
        return new int[] { -1, -1 };
    }

}
