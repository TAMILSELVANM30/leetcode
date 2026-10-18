// Last updated: 10/18/2026, 9:14:06 PM
class Solution {
    public int minDeletions(int[] nums) {
        int count=0;
        int n=nums.length;//used 
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) count++;
        }
        return count;
    }
}