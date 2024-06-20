public class ls2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 15;
        System.out.println(linearSearch(arr, target));
    }

    static boolean linearSearch(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return true;

                }

            }

        }
        return false;
    }
}