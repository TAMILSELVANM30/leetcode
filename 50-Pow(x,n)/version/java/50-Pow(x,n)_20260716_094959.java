// Last updated: 7/16/2026, 9:49:59 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long N=n;
4        if(n<0){
5            x=1/x;
6            N=-N;
7        }
8        return power(x,N);
9    }
10    public double power(double x, long N){
11        if(N==0){
12            return 1;
13        }
14        double half=power(x,N/2);
15        if(N%2==0){
16            return half*half;
17        }else{
18            return half*half*x;
19        }
20    }
21}