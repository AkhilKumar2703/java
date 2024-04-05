class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];

        // int ans = 0;
        // for(int i =0 ; i< nums.length ; i++){
        // if(nums[i]<nums[i+1]){
        // ans = nums[i];

        // }
        // }

        // return ans;
    }
}