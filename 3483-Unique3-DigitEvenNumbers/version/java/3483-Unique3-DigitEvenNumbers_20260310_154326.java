// Last updated: 3/10/2026, 3:43:26 PM
1import java.util.*;
2
3class Solution {
4    public int totalNumbers(int[] digits) {
5        Set<Integer> set = new HashSet<>();
6        int n = digits.length;
7        
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < n; j++) {
10                for (int k = 0; k < n; k++) {
11                    if (i != j && j != k && i != k) {
12                        int d1 = digits[i];
13                        int d2 = digits[j];
14                        int d3 = digits[k];
15                        if (d1 != 0 && d3 % 2 == 0) {
16                            int num = d1 * 100 + d2 * 10 + d3;
17                            set.add(num);
18                        }
19                    }
20                }
21            }
22        }
23        
24        return set.size();
25    }
26}