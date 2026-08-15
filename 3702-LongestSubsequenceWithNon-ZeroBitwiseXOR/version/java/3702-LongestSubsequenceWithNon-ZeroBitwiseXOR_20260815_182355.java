// Last updated: 8/15/2026, 6:23:55 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int n =nums.length;
4        int total_xor=0;
5        long count=0;
6        for(int i=0;i<n;i++){
7            total_xor=total_xor^nums[i];
8            count+=nums[i];
9
10        }
11        if(count==0){
12            return 0;
13        }
14        if(total_xor==0){
15            return n-1;
16        }if(total_xor!=0){
17            return n;
18        }
19        return 0;
20    }
21}