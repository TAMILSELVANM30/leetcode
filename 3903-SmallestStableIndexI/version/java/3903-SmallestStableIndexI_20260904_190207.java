// Last updated: 9/4/2026, 7:02:07 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n=nums.length;
4        int i=n-1;
5        int[] sufixsum = new  int[n];
6        int[] prefixsum=new int[n];
7       int  mini=Integer.MAX_VALUE;
8        while(0<=i){
9           
10            mini=Math.min(mini,nums[i]);
11            sufixsum[i]=mini;
12            i--;
13        }
14        i=0;
15        int maxi=0;
16       while(i<n){
17          maxi=Math.max(maxi,nums[i]);
18         prefixsum[i]=maxi;   
19        i++;
20       }
21       for(int j=0;j<n;j++){
22        if(prefixsum[j]-sufixsum[j]<=k){
23            return j;
24        }
25       }
26       return -1;
27        
28    }
29}