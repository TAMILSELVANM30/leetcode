// Last updated: 6/19/2026, 1:43:55 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int alt=0;
4        int m_alt=0;
5        for (int s:gain){
6            alt+=s;
7         m_alt=Math.max(alt,m_alt);
8        }
9        return m_alt;
10    }
11}