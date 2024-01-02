public class lc268 {

}
    // Amazon Question

    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);

            } else {
                i++;
            }

        }
        // case 1 when elements id not at its right index
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;

            }
        }
        // case 2 when N is not present here ans= N itself
        return arr.length;
    }

static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;

}
