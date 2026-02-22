// Last updated: 2/22/2026, 11:54:03 PM
1class Solution {
2    public int binaryGap(int n) {
3        String binary = Integer.toBinaryString(n);
4        int lastIndex = -1;
5        int maxGap = 0;
6
7        for (int i = 0; i < binary.length(); i++) {
8            if (binary.charAt(i) == '1') {
9                if (lastIndex != -1) {
10                    maxGap = Math.max(maxGap, i - lastIndex);
11                }
12                lastIndex = i;
13            }
14        }
15        return maxGap;
16    }
17}