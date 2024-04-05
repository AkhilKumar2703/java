class Solution {
    public int singleNumber(int[] nums) {
        // initialise the unique element
        int unique = 0;
        for (int n : nums) {
            // we will XOR the whole elments of array
            unique ^= n;
        }
        return unique;
    }
}