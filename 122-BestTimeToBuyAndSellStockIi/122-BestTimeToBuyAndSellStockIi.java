// Last updated: 7/7/2026, 10:25:35 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int a=0;
        for(int i=0;i<n-1;i++){
           
            if(prices[i]<prices[i+1]){
                a+=prices[i+1]-prices[i];
            }
            
        }
        return a;
    }
}