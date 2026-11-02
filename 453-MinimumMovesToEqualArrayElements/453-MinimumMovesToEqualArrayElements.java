// Last updated: 11/2/2026, 10:24:52 PM
class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i:nums){
            min=Math.min(min, i);
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-min;
        }
        int ans=0;
        for(int i:nums){
            ans+=i;
        }
        return ans;
    }
}