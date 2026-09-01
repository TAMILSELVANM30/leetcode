// Last updated: 9/1/2026, 11:37:33 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int le=word.length();
4        int count=0;
5
6        for(int i=0;i<le;i++){
7            count +=(i>>3)+1;
8
9        }
10        return count;
11        
12    }
13}