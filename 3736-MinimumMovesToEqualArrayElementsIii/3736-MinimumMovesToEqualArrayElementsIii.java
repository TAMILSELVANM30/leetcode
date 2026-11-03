// Last updated: 11/3/2026, 10:50:59 PM
class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i:nums){
            max=Math.max(max, i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            nums[i]=max-nums[i];
            ans+=nums[i];
        }
      
        return ans;
    }
}