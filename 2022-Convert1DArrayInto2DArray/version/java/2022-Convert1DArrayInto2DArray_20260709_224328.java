// Last updated: 7/9/2026, 10:43:28 PM
1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) {
3        // int m=m-1;
4        // int n=n-1;
5        int p=0;
6        int [][]ar=new int[m][n];
7        if(original.length!=m*n){
8            return new int[0][0];
9        }else{
10            for(int i=0;i<m;i++){
11                for(int j=0;j<n;j++){
12                    ar[i][j]=original[p++];
13                    
14                }
15            }
16        }
17        
18    return ar;
19    }
20}