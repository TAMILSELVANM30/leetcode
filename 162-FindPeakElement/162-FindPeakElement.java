// Last updated: 10/30/2026, 1:20:27 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n=nums.length;
4        int left=0, right=n-1;
5        while(left<right){
6            int mid=left+((right-left)/2);
7            if(nums[mid]<nums[mid+1]){
8                left=mid+1;
9            }else{
10                right=mid;
11            }
12        }
13        return right;
14    }
15}