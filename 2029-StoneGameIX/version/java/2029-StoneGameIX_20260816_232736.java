// Last updated: 8/16/2026, 11:27:36 PM
1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int n=stones.length;
4        int[] arr=new int[3];
5        for(int i=0;i<n;i++){
6            arr[stones[i]%3]++;
7
8        }
9        int cero=arr[0];
10        int a1=arr[1];
11        int a2=arr[2];
12        if(cero%2==0){
13            return a1>0&& a2>0;
14        }
15        return Math.abs(a1-a2)>2;
16    }
17}