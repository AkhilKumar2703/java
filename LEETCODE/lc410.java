class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        // this linear search is done t0 get the range
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];

        }
        // here binary search starts
        while (start < end) {
            // try fo potential answer that can be found(middle value)
            int mid = start + (end - start) / 2;
            // sum represents sum of subarrrays
            int sum = 0;
            // pieces represents subarray made assumed by us
            int piece = 1;
            // this for loop says that add value of num ie element of array is
            // into sum that is subarray
            // given condition if it exceeds the mid value then
            // increment subarray or piece
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    piece++;
                } else {
                    sum += num; `
                }
            }
            // check to make k == piece
            // after gettig pieces we will compare them with K (they are given subarray)
            if (piece > k) {
                start = mid + 1;

            } else {
                end = mid;
            }

        }
        return end; // here at the end both end and start will be equal

    }
}