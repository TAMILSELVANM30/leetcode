// Last updated: 8/12/2026, 11:13:05 PM
1class Solution {
2    public long sumAndMultiply(int n) {
3        long x = 0,sum = 0,len = 1;
4        while(n != 0){
5            x = (n % 10) * len + x;
6            if(n % 10 != 0) len = len * 10;
7            sum += n % 10;
8            n = n / 10;
9        }
10        return sum * x;
11    }
12}