// Last updated: 10/13/2026, 9:46:10 PM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3       
4        long[] a = new long[nums.length];
5        for (int i = 0; i < nums.length; i++)
6            a[i] = (long) nums[i] * nums[i];
7
8        
9        Arrays.sort(a);
10
11        long ans = 0;
12        int k = nums.length / 2;   
13
14        
15        for (int i = 0; i < k; i++)
16            ans -= a[i];
17
18       
19        for (int i = k; i < nums.length; i++)
20            ans += a[i];
21
22        return ans;
23    }
24}