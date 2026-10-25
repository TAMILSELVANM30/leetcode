// Last updated: 10/25/2026, 11:17:48 PM
class Solution {
    public int peakValleyDifference(int[] nums) {
        int peek=0, valley=0;
        int n=nums.length;
        for(int i=1;i<n-1;i++){
            int a=i-1;
            int b=i+1;
            if(nums[a]>nums[i] && nums[i]<nums[i+1]) valley+=nums[i];
            if(nums[a]<nums[i] &&  nums[i]>nums[i+1]) peek+=nums[i];
        }
        return peek-valley;
    }
}