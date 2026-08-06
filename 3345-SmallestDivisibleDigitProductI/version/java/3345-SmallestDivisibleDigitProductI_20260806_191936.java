// Last updated: 8/6/2026, 7:19:36 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int mul=1,ans=0;
4      
5      
6      for(int i=n;i<101;i++){
7        int m= multiply(mul,i);
8        if(m%t==0){
9            ans=i;
10            break;
11        }
12      }
13      return ans;
14       
15    }
16    public int multiply(int mul,int n){
17        while(n!=0){
18
19        mul*=n%10;
20        n=n/10;
21        }
22        return mul;
23
24    }
25}