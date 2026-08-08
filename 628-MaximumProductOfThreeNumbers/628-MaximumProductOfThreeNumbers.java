// Last updated: 8/8/2026, 9:51:44 PM
class Solution {
    public int maximumProduct(int[] nums) {
       return max(nums);
    }
    public int max(int [] nums){
         int n=nums.length;
         
         Arrays.sort(nums);
         int a= nums[n-1]*nums[n-2]*nums[n-3];
        int b=nums[0]*nums[1]*nums[n-1];
        return Math.max(a,b);
    }
}