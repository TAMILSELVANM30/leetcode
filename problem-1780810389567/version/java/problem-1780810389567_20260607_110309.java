// Last updated: 6/7/2026, 11:03:09 AM
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3    int count=0;
4    int a=Math.max((n-k),1);
5    int b=(n+k);
6    for(int i=a;i<=b;i++){
7        if((Math.abs(n-i)<=k)&&((n&i)==0)){
8            count+=i;
9        }
10    }
11        return count;
12    }
13}