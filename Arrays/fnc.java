
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class fnc {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 44, 56 };
        System.out.println(Arrays.toString(nums));
        System.out.println("----------------------------------------------------");
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr) {
        arr[0] = 66;
    }

}
