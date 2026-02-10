// Last updated: 2/10/2026, 8:47:40 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int le=grid.length;
        int le1=grid[0].length;
        int dummy=0;
        for(int i=0;i<le;i++){
            for(int j=0;j<le1;j++){
                 if (grid[i][j]<=-1){
                      dummy+=1;
                 }

            }
        }
        return dummy;
    }
}