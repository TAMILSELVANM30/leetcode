// Last updated: 9/16/2026, 10:35:54 PM
1class Solution {
2    public int numberOfSets(int n, int k) {
3        final int MOD = 1_000_000_007;
4        long[][] dp = new long[n][k + 1];
5
6 
7        for (int i = 0; i < n; i++) dp[i][0] = 1;
8
9        for (int j = 1; j <= k; j++) {
10            long sum = 0;
11            for (int i = 1; i < n; i++) {
12          
13                sum = (sum + dp[i - 1][j - 1]) % MOD;
14              
15                dp[i][j] = (dp[i - 1][j] + sum) % MOD;
16            }
17        }
18
19        return (int) dp[n - 1][k];
20    }
21}