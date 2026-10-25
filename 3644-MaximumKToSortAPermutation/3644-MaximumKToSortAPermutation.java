// Last updated: 10/25/2026, 11:18:25 PM
class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int temp = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                temp &= nums[i];
            }
        }

        return temp == -1 ? 0 : temp;
    }
}