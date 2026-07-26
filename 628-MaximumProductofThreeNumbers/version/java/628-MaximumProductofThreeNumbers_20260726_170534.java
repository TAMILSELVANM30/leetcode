// Last updated: 7/26/2026, 5:05:34 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3       return max(nums);
4    }
5    public int max(int [] nums){
6         int n=nums.length;
7         
8         Arrays.sort(nums);
9         int a= nums[n-1]*nums[n-2]*nums[n-3];
10        int b=nums[0]*nums[1]*nums[n-1];
11        return Math.max(a,b);
12    }
13}