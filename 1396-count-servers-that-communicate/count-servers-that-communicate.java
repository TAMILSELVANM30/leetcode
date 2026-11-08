class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length, m=grid[0].length;

        int[] row=new int[n];
        int[] col=new int[m];
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                    total++;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 && col[j]==1 && grid[i][j]==1){
                    count++;
                }
            }
        }
        return answer(total, count);

    }
    public static int answer(int total, int count){
     return total-count;
    }
}