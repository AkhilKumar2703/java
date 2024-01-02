class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if we didnt get the pivot the
        // we will do normal binary search for target
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);

        }
        // 2.) if the pivot is target, then return pivot
        if (nums[pivot] == target) {
            return pivot;

        }
        // 3.) if the target is lesser than the pivot, then return
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        // 4.) if the target is greater than the pivot, then return

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // total 4 cases
            // 1) when the mid is > , then mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;

            }
            // 2) when the mid is < , then pivot can be (mid+1)
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;

            }
            // 3) when the start element > mid element
            // then the element after the mid will not have the pivot
            // pivot value will be (mid-1)
            if (arr[mid] <= arr[start]) {
                end = mid - 1;

            } else {
                start = mid + 1;

            }
            // 4) when the start element < mid element
            // then the element before the mid will not have the pivot
            // pivot value will be (s = mid +1)

        }
        return -1;

    }

}