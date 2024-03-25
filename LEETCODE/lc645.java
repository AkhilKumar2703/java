public class lc645 {

}

////////////////////////////////////////////////////////////////
class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);

            } else {
                i++;
            }

        }
        // case 1 when elements id not at its right index
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 };
                // nums[index] will give us duplicate number
                // index +1 will give us the missing number

            }
        }
        // case 2 when N is not present here ans= N itself
        return new int[] { -1, -1 };

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
