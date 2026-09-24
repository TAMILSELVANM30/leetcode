// Last updated: 9/24/2026, 8:27:24 AM
1class Solution {
2    public int smallestIndex(int[] nums) {
3       int n=nums.length;
4       for(int i=0;i<n;i++){
5        int sum=0;
6        int m=nums[i];
7        while(m!=0){
8            sum+=m%10;
9            m=m/10;
10        }
11        if(i==sum){
12            return i;
13        }
14       }
15       return -1;
16    }
17}