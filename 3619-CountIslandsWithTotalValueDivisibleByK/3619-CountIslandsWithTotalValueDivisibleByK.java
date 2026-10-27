// Last updated: 10/27/2026, 7:28:37 PM
class Solution {
    long sum=0;
    public int countIslands(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        long ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              if(grid[i][j]>0){
                sum=0;
                long fun=0;
              fun+=dfs(grid,i,j);
              if((long)fun%k==0){
                ans++;
              }
              }
            }
        }
        return (int) ans;
        
    }

    public  long dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 ||  i>=grid.length || j>=grid[0].length || grid[i][j]==0 ){
            return 0 ;
        }
       
        sum+=grid[i][j];
        grid[i][j]=0;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        
        return sum;
    }
}