// Last updated: 9/14/2026, 11:53:24 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int dis=discounts.length;
        int price=prices.length;
        int m=Math.min(dis,price);
       
        
        double result=0;
        int firstd=dis-m;
        int fprice=price-m;
        
        for(int i=0;i<fprice;i++){
            result+=prices[i];
        }
        
        for(int i=0;i<m;i++){
                result+= (double) prices[fprice+i]*(double)(100-discounts[firstd+i])/100.0;  
        }
        
        
        
        return result;
    }
}