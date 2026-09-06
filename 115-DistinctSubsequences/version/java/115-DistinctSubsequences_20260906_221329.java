// Last updated: 9/6/2026, 10:13:29 PM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5
6        int[][] dp = new int[n + 1][m + 1];
7
8        for (int i = 0; i <= n; i++) {
9            dp[i][m] = 1;
10        }
11
12        for (int i = n - 1; i >= 0; i--) {
13            for (int j = m - 1; j >= 0; j--) {
14                dp[i][j] = dp[i + 1][j];
15
16                if (s.charAt(i) == t.charAt(j)) {
17                    dp[i][j] += dp[i + 1][j + 1];
18                }
19            }
20        }
21
22        return dp[0][0];
23    }
24}