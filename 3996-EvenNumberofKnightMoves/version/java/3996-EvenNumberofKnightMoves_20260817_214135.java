// Last updated: 8/17/2026, 9:41:35 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return ((start[0] + start[1]) & 1) == ((target[0] + target[1]) & 1);
    }
}