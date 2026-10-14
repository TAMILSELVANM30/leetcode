// Last updated: 10/14/2026, 11:45:47 PM
1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        if(sum>num*9){
4       return "";     
5        }
6      StringBuilder ans=new StringBuilder();
7       
8        while(sum>0){
9            if(sum>9){
10                ans.append("9");
11            }
12            else{
13                ans.append(sum);
14            }
15            sum=sum-9;
16        }
17       int ansle=ans.length();
18        int y=num-ansle;
19       ans.append("0".repeat(y));
20        return ans.toString();
21
22    }
23}