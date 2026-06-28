// Last updated: 6/28/2026, 11:36:18 PM
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // int m=m-1;
        // int n=n-1;
        int p=0;
        int [][]ar=new int[m][n];
        if(original.length!=m*n){
            return new int[0][0];
        }else{
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    ar[i][j]=original[p++];
                    
                }
            }
        }
        
    return ar;
    }
}