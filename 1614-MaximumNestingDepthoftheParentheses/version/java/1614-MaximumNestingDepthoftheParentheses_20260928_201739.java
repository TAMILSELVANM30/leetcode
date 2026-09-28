// Last updated: 9/28/2026, 8:17:39 PM
1class Solution {
2    public int maxDepth(String s) {
3        int n=s.length();
4        int i=0;
5        int ans=0;
6        int count=0;
7        while(i<n){
8            char ch=s.charAt(i);
9            if(ch=='(') {
10                count++;
11            }
12            if(ch==')'){
13                count--;
14            }
15            ans=Math.max(ans,count);
16            
17            i++;
18        }
19        return ans;
20    }
21}