// Last updated: 7/3/2026, 12:26:29 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        int a=0;
5        for(int i=0;i<n-1;i++){
6           
7            if(prices[i]<prices[i+1]){
8                a+=prices[i+1]-prices[i];
9            }
10            
11        }
12        return a;
13    }
14}