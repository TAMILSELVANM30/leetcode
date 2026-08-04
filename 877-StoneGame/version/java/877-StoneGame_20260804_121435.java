// Last updated: 8/4/2026, 12:14:35 PM
1class Solution {
2    public boolean stoneGame(int[] piles) {
3        int n = piles.length;
4        int[][] dp = new int[n][n];
5
6        // Base case: when only one pile is left
7        for (int i = 0; i < n; i++) {
8            dp[i][i] = piles[i];
9        }
10
11        // Fill DP table
12        for (int len = 2; len <= n; len++) {
13            for (int i = 0; i + len - 1 < n; i++) {
14                int j = i + len - 1;
15                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
16            }
17        }
18
19        // If Alice's score difference > 0, she wins
20        return dp[0][n - 1] > 0;
21    }
22
23    public static void main(String[] args) {
24        Solution sol = new Solution();
25
26        // Example where Alice wins (true)
27        int[] piles1 = {5, 3, 4, 5};
28        System.out.println(sol.stoneGame(piles1)); // true
29
30        // Contributed test case where Bob wins (false)
31        int[] piles2 = {1, 100, 3, 2};
32        System.out.println(sol.stoneGame(piles2)); // false
33    }
34}
35