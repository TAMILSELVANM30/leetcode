// Last updated: 7/19/2026, 5:37:54 PM
1class Solution {
2    public String smallestSubsequence(String text) {
3        StringBuilder sb = new StringBuilder();
4        int[] count = new int[128];
5        boolean[] used = new boolean[128];
6        for (final char c : text.toCharArray())
7            ++count[c];
8        for (final char c : text.toCharArray()) {
9            --count[c];
10            if (used[c])
11                continue;
12            while (sb.length() > 0 && last(sb) > c && count[last(sb)] > 0) {
13                used[last(sb)] = false;
14                sb.setLength(sb.length() - 1);
15            }
16            used[c] = true;
17            sb.append(c);
18        }
19        return sb.toString();
20    }
21
22    private char last(StringBuilder sb) {
23        return sb.charAt(sb.length() - 1);
24    }
25}