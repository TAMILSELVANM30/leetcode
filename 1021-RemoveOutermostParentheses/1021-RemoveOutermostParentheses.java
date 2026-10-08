// Last updated: 10/8/2026, 9:34:09 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3      int n=s.length();
4      int depth=0;
5      StringBuilder ans=new StringBuilder();
6      for(char c:s.toCharArray()){
7        if(c=='('){
8            if(depth>0){
9                ans.append('(');
10            }
11            depth++;
12        }
13        else{
14            depth--;
15            if(depth>0){
16                ans.append(')');
17            }
18        }
19      }  
20      return ans.toString();
21    }
22}