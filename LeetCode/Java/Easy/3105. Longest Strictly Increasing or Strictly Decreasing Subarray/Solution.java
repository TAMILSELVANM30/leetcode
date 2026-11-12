class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase=1, decrease=1;
        int n=nums.length;
        int max=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                decrease=1;
                increase++;
                
            }if(nums[i]<nums[i-1]){
                increase=1;
                decrease++;
                
            }if(nums[i]==nums[i-1]){
                decrease=1;
                increase=1;
            }
            max=Math.max(max, Math.max(increase, decrease));
        }
        return max;
    }
}