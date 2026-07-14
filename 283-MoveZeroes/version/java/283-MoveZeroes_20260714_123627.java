// Last updated: 7/14/2026, 12:36:27 PM
1class Solution {
2    public double myPow(double x, int n) {
3        long N=n;
4        if(N<0){
5            N=-n;
6            x=1/x;
7        }
8        return power(x,N);
9    }
10    public double power(double x, long n){
11        if(n==0){
12            return 1;
13        }
14        double half=power(x,n/2);
15        if(n%2==0){
16            return half*half;
17        }else{
18            return half*half*x;
19        }
20    }
21    
22}