// Last updated: 9/20/2026, 10:56:54 AM
1class Solution {
2    public int reverseDegree(String s) {
3        int n=s.length();
4        int sum=0;
5        for(int i=0;i<n;i++){
6            int  ch=s.charAt(i)-'a';
7             sum+=(26-ch)*(i+1);
8
9        }
10        return sum;
11    }
12}