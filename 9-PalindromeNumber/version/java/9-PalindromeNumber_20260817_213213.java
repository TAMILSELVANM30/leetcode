// Last updated: 8/17/2026, 9:32:13 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0) return false;
4        int ori=x,rev=0;
5        while(x>0){
6
7            rev=rev*10+(x%10);
8           x= x/10;
9        }
10        return ori==rev;
11    }
12
13    
14}