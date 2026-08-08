// Last updated: 8/8/2026, 9:50:01 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int s1=start[0];
        int s2=start[1];
        int t1=target[0];
        int t2=target[1];
        int fin=(s1+s2)-(t1+t2);
        return fin%2==0;
    }
}