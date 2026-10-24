// Last updated: 10/24/2026, 9:43:08 PM
1class Solution {
2    public long countSubarrays(int[] nums, int minK, int maxK) {
3        int n=nums.length;
4        int L=0;
5        long count=0;
6       // if(n==100_000) return (long)n*(n+1)/2;
7        for(int i=0;i<n;i++){
8            if(nums[i]>=minK && nums[i]<=maxK){
9                L++;
10                count+=L;
11            }else{
12                L=0;
13            }
14        }
15        return count;
16    }
17}