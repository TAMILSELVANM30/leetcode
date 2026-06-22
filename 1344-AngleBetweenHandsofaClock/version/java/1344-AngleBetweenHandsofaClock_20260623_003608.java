// Last updated: 6/23/2026, 12:36:08 AM
1class Solution {
2    public double angleClock(int hour, int minutes) {    
3    double n;
4    n=Math.abs((hour*30)-(minutes*5.5));
5    double n3n=(360-n);
6
7     return Math.min(n3n,n);
8
9    }
10}