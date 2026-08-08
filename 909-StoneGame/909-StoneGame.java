// Last updated: 8/8/2026, 9:51:32 PM
class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];

        // Base case: when only one pile is left
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        // Fill DP table
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }

        // If Alice's score difference > 0, she wins
        return dp[0][n - 1] > 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example where Alice wins (true)
        int[] piles1 = {5, 3, 4, 5};
        System.out.println(sol.stoneGame(piles1)); // true

        // Contributed test case where Bob wins (false)
        int[] piles2 = {1, 100, 3, 2};
        System.out.println(sol.stoneGame(piles2)); // false
    }
}
