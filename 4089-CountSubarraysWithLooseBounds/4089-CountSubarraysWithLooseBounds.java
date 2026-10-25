// Last updated: 10/25/2026, 11:17:47 PM
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n=nums.length;
        int L=0;
        long count=0;
       // if(n==100_000) return (long)n*(n+1)/2;
        for(int i=0;i<n;i++){
            if(nums[i]>=minK && nums[i]<=maxK){
                L++;
                count+=L;
            }else{
                L=0;
            }
        }
        return count;
    }
}