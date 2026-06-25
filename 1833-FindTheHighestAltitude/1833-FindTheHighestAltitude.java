// Last updated: 6/25/2026, 11:33:10 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int m_alt=0;
        for (int s:gain){
            alt+=s;
         m_alt=Math.max(alt,m_alt);
        }
        return m_alt;
    }
}