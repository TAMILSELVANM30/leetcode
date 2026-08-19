// Last updated: 8/19/2026, 8:53:11 PM
class Solution {
    public int longestSubsequence(int[] nums) {
        int n =nums.length;
        int total_xor=0;
        long count=0;
        for(int i=0;i<n;i++){
            total_xor=total_xor^nums[i];
            if(nums[i]==0){
            count+=1;
            }

        }
        if(count==n){
            return 0;
        }
        if(total_xor==0){
            return n-1;
        }if(total_xor!=0){
            return n;
        }
        return 0;
    }
}