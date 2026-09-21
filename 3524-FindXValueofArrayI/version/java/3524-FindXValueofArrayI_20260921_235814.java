// Last updated: 9/21/2026, 11:58:14 PM
1class Solution {
2    int n;
3
4    public long[] resultArray(int[] nums, int k) {
5        n = nums.length;
6        long[] res = new long[k];
7
8        for (int i = 0; i < n; i++)
9            nums[i] %= k;
10
11        for (int r = 0; r < k; r++) {
12            long[][] dp = new long[n][k + 1];
13            for (long[] row : dp) Arrays.fill(row, -1);
14            res[r] = solve(0, k, r, k, nums, dp);
15        }
16
17        return res;
18    }
19
20    long solve(int i, int prevProd, int req, int k,
21               int[] nums, long[][] dp) {
22
23        if (i >= nums.length)
24            return 0;
25
26        if (dp[i][prevProd] != -1)
27            return dp[i][prevProd];
28
29        long skip = 0, take = 0;
30
31       
32        if (prevProd == k) {
33            skip = solve(i + 1, k, req, k, nums, dp);
34        }
35
36        
37        long curProd;
38        if (prevProd == k)
39            curProd = nums[i];
40        else
41            curProd = ((long) prevProd * nums[i]) % k;
42
43        take += (curProd == req) ? 1 : 0;
44        take += solve(i + 1, (int) curProd, req, k, nums, dp);
45
46        return dp[i][prevProd] = take + skip;
47    }
48}