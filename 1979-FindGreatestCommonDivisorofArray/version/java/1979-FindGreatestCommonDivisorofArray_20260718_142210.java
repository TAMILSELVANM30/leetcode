// Last updated: 7/18/2026, 2:22:10 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int le=nums.length-1;
5        int small=nums[0];
6        int large=nums[le];
7        return gcd(small, large);
8    }
9    public int gcd(int small,int large){
10        if(large==0){
11            return small;
12        }
13        return gcd(large,small % large);
14
15    }
16}