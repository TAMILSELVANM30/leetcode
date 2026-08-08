// Last updated: 8/8/2026, 9:51:09 PM
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