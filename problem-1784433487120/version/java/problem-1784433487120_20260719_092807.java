// Last updated: 7/19/2026, 9:28:07 AM
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        int s1=start[0];
4        int s2=start[1];
5        int t1=target[0];
6        int t2=target[1];
7        int fin=(s1+s2)-(t1+t2);
8        return fin%2==0;
9    }
10}