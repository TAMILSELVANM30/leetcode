// Last updated: 3/17/2026, 2:20:41 PM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int n=0;
4        for(int i=1;i<num-1;i++){
5            if (num%i==0){
6              n+=i;
7              }
8            }
9             
10           if (n==num)
11            return true;
12           else
13            return false;
14    }
15}