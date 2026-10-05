// Last updated: 10/5/2026, 9:35:39 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int depth=0;
4        int n=s.length();
5        int res=0;
6        for(int i=0;i<n;i++){
7            char c=s.charAt(i);
8            if(c=='('){
9                depth++;
10            }
11            if(c==')'){
12                if(s.charAt(i-1)=='('){
13                res+=(int) Math.pow(2,depth);
14                }
15                depth--;
16            }
17        }
18        return res/2;
19    }
20}