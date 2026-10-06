// Last updated: 10/6/2026, 6:04:43 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int depth=0;
4        int n=s.length();
5        int answer=0;
6       //Stack<Character> st=new Stack<>();
7        for(int i=0;i<n;i++){
8            char c=s.charAt(i);
9            if(c=='('){
10                depth++;
11            }
12            if(c==')'){
13                depth--;
14            }
15            if(depth<0){
16                answer++;
17                depth=0;
18            }
19        }
20        int fin_ans=Math.abs(depth-0) + answer;
21        return fin_ans;
22    }
23}