// Last updated: 9/15/2026, 10:06:18 PM
1class Solution {
2    public int maxPalindromes(String s, int k) {
3        int n = s.length(), ans = 0, end = -1;
4
5        for (int i = 0; i < n; i++) {
6            
7            for (int l0 : new int[]{i - 1, i}) {
8                int l = l0, r = i;
9                
10                while(l>=0 && r < n && s.charAt(l) == s.charAt(r)){
11                    if (r - l + 1 >= k && l > end) {
12                        ans++;
13                        end = r;
14                        break;
15                    }
16
17                    l--;
18                    r++;
19                }
20            }
21        }
22
23        return ans;
24    }
25}