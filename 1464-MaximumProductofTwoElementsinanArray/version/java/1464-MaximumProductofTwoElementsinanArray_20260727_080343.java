// Last updated: 7/27/2026, 8:03:43 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        return maxpro(nums);
4        
5    }
6    public int maxpro(int[] nums){
7        Arrays.sort(nums);
8        int n=nums.length;
9        int last=nums[n-1]-1;
10        int lastbefore=nums[n-2]-1;
11        return last*lastbefore;
12        
13    }
14}