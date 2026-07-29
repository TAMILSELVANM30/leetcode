// Last updated: 7/29/2026, 9:30:29 AM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int[] c = new int[26];
4        int n = s.length();
5        String middle = (n % 2 == 0) ? "" : String.valueOf(s.charAt(n >> 1));
6        StringBuilder ans = new StringBuilder();
7        n >>= 1;
8        for(int i = 0; i < n; i++){
9            c[s.charAt(i) - 'a']++;
10        }
11
12        for(int i = 0; i < 26; i++){
13            ans.append(String.valueOf((char)(i + 'a')).repeat(c[i]));
14        }
15
16        return ans.toString() + middle + ans.reverse().toString();
17    }
18}