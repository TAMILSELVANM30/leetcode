// Last updated: 10/4/2026, 9:21:43 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int min =0; // ) count
4        int max=0; // ( count
5        for(char c : s.toCharArray()){
6            if(c==')'){
7                min --;
8                max --;
9            }
10            if(max<0) return false;
11            if(c=='('){
12                min ++;
13                max ++;
14            }
15            if(c=='*'){
16                min --;
17                max ++;
18            }
19            if(min<0) min=0;
20            
21
22    }
23            return min==0;
24    }
25}