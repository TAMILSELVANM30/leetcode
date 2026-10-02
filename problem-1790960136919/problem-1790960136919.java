// Last updated: 10/2/2026, 10:25:36 PM
1class Solution {
2    private List<String> ans = new ArrayList<>();
3
4    private void backtrack(StringBuilder s, int open, int close, int n) {
5
6        // A complete valid combination is formed
7        if (s.length() == 2 * n) {
8            ans.add(s.toString());
9            return;
10        }
11
12        // Add '(' if opening brackets are still available
13        if (open < n) {
14            s.append('(');
15
16            backtrack(s, open + 1, close, n);
17
18            // Undo the choice
19            s.deleteCharAt(s.length() - 1);
20        }
21
22        // Add ')' only when it is safe
23        if (close < open) {
24            s.append(')');
25
26            backtrack(s, open, close + 1, n);
27
28            // Undo the choice
29            s.deleteCharAt(s.length() - 1);
30        }
31    }
32
33    public List<String> generateParenthesis(int n) {
34        ans.clear();
35
36        StringBuilder s = new StringBuilder(2 * n);
37
38        backtrack(s, 0, 0, n);
39
40        return ans;
41    }
42}