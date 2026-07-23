// Last updated: 7/23/2026, 8:15:14 PM
1class Solution {
2    int[][] dp;
3    public int rob(int[] nums) {
4        int n = nums.length;
5        dp = new int[n][2];
6        for(int i = 0 ; i < n ; i++){
7            dp[i][0] = dp[i][1] = -1;
8        }
9        return Fn(nums,n - 1,0);
10    }
11    private int Fn(int[]nums,int idx,int flag){
12        if(idx < 0){
13            return 0;
14        }
15        if(dp[idx][flag] != -1){
16            return dp[idx][flag];
17        }
18        int x = Fn(nums,idx - 1,0);
19        int y = Fn(nums,idx - 1,1) + (flag ^ 1) * nums[idx];
20        return dp[idx][flag] = Math.max(x,y);
21    }
22}