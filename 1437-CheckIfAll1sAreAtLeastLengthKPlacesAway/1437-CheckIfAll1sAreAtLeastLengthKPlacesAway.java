// Last updated: 9/14/2026, 11:55:46 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        final int n=nums.length;
        int last=-100000000;
        for(int i=0; i<n; i++){
            if (nums[i]==1){
                if (i-last-1<k) return false;
                last=i;
            }
        }
        return true;
        
    }
}