// Last updated: 6/27/2026, 11:39:19 AM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i=0;
4        int j=0;
5        while(j<t.length()){
6            if(s.length()==i){
7                return true;
8            }
9           
10            if(s.charAt(i)==t.charAt(j)){
11                i++;
12                j++;
13            }else{
14                j++;
15            }}
16        if(i==s.length()){
17        return true;}
18        else{
19            return false;}
20    }
21}