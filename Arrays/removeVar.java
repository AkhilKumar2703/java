public class removeVar {
    public static void main(String[] args) {
        int[] arr = { 1, 22, 22, 6, 54, 88, 22 };
        int ans = removeElement(arr, 22);
        System.out.println(ans);

    }

    static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
// val to be removed
