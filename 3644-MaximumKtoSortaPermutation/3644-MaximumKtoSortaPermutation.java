// Last updated: 10/23/2026, 11:33:40 PM
1class Solution {
2    public int sortPermutation(int[] nums) {
3        int n = nums.length;
4        int temp = -1;
5
6        for (int i = 0; i < n; i++) {
7            if (nums[i] != i) {
8                temp &= nums[i];
9            }
10        }
11
12        return temp == -1 ? 0 : temp;
13    }
14}