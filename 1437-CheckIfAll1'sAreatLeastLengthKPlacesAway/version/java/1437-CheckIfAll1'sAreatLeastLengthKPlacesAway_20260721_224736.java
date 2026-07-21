// Last updated: 7/21/2026, 10:47:36 PM
1class Solution {
2    public boolean kLengthApart(int[] nums, int k) {
3        final int n=nums.length;
4        int last=-100000000;
5        for(int i=0; i<n; i++){
6            if (nums[i]==1){
7                if (i-last-1<k) return false;
8                last=i;
9            }
10        }
11        return true;
12        
13    }
14}