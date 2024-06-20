import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class twodarr {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        Scanner in = new Scanner(System.in);

        // INPUT

        for (int r = 0; r < arr.length; r++) {
            // for columns
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = in.nextInt();
            }
        }

        // OUTPUT

        for (int r = 0; r < arr.length; r++) {

            System.out.println(Arrays.toString(arr[r]));

        }

    }
}
