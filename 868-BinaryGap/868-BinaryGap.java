// Last updated: 9/14/2026, 11:56:27 PM
class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int lastIndex = -1;
        int maxGap = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (lastIndex != -1) {
                    maxGap = Math.max(maxGap, i - lastIndex);
                }
                lastIndex = i;
            }
        }
        return maxGap;
    }
}