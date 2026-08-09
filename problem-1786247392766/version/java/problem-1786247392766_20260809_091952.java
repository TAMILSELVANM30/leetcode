// Last updated: 8/9/2026, 9:19:52 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int dis=discounts.length;
6        int price=prices.length;
7        int m=Math.min(dis,price);
8       
9        
10        double result=0;
11        int firstd=dis-m;
12        int fprice=price-m;
13        
14        for(int i=0;i<fprice;i++){
15            result+=prices[i];
16        }
17        
18        for(int i=0;i<m;i++){
19                result+= (double) prices[fprice+i]*(double)(100-discounts[firstd+i])/100.0;  
20        }
21        
22        
23        
24        return result;
25    }
26}