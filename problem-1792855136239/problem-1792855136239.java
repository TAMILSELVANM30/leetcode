// Last updated: 10/24/2026, 8:48:56 PM
1class Solution {
2    public int peakValleyDifference(int[] nums) {
3        int peek=0, valley=0;
4        int n=nums.length;
5        for(int i=1;i<n-1;i++){
6            int a=i-1;
7            int b=i+1;
8            if(nums[a]>nums[i] && nums[i]<nums[i+1]) valley+=nums[i];
9            if(nums[a]<nums[i] &&  nums[i]>nums[i+1]) peek+=nums[i];
10        }
11        return peek-valley;
12    }
13}