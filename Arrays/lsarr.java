
public class lsarr {
    public static void main(String[] args) {
        int[] arr = { 15, 27, 29, 8, 56, 48, 36 };
        int target = 48;
        int ans = linearSearch(arr, target);
        boolean check =linearSearch1(arr, target);
        System.out.println(ans);
        System.out.println(check);

    }

    static int linearSearch(int[] arr, int target) {
        
        for (int index = 0; index < arr.length; index++) {
            
            if (arr[index] == target) {
                return index;

            }

        }
        return -1;
    }

    static boolean  linearSearch1(int[] arr, int target) {
        
        for (int index = 0; index < arr.length; index++) {
            
            if (arr[index] == target) {
                return true;

            }

        }
        return false;
    }
}