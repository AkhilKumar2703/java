package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class changing {
    public static void main(String[] args) {

        // create arrays
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums) {
        nums[0] = 99;
    }

}