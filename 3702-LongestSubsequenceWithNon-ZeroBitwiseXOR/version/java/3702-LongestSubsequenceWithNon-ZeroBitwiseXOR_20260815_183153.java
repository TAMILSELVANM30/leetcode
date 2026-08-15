// Last updated: 8/15/2026, 6:31:53 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int n =nums.length;
4        int total_xor=0;
5        long count=0;
6        for(int i=0;i<n;i++){
7            total_xor=total_xor^nums[i];
8            if(nums[i]==0){
9            count+=1;
10            }
11
12        }
13        if(count==n){
14            return 0;
15        }
16        if(total_xor==0){
17            return n-1;
18        }if(total_xor!=0){
19            return n;
20        }
21        return 0;
22    }
23}