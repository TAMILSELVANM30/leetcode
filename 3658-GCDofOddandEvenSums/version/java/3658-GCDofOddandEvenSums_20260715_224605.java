// Last updated: 7/15/2026, 10:46:05 PM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int sumodd=n*n;
4        int sumeven=n*n+n;
5        return GCD(sumodd,sumeven);
6        
7    }
8    public int GCD(int sumodd,int sumeven){
9        if(sumeven==0){
10            return sumodd;
11        }
12        return GCD(sumeven, sumodd % sumeven);
13    }
14}