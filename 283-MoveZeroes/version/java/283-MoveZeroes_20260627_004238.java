// Last updated: 6/27/2026, 12:42:38 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int lastNonZeroFoundAt = 0;
4
5      
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] != 0) {
8                nums[lastNonZeroFoundAt] = nums[i];
9                lastNonZeroFoundAt++;
10            }
11        }
12
13       
14        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
15            nums[i] = 0;
16        }
17    }
18}
19