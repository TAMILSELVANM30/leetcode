// Last updated: 10/7/2026, 11:42:35 PM
1class Solution {
2    public int[] maxDepthAfterSplit(String seq) {
3        int n=seq.length();
4        int[] ans=new int[n];
5        int depth=0;
6        for(int i=0;i<n;i++){
7            char ch=seq.charAt(i);
8            if(ch=='('){
9                ans[i]=depth%2;
10                depth++;
11            }
12            if(ch==')'){
13                depth--;
14                ans[i]=depth%2;
15            }
16        }
17        return ans;
18    }
19}