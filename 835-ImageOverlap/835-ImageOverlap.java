// Last updated: 9/14/2026, 11:56:29 PM
class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<int[]>image1=new ArrayList<>();
        List<int[]>image2=new ArrayList<>();
        int n=img1.length;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(img1[row][col]==1) image1.add(new int[] {row,col});
                if(img2[row][col]==1) image2.add(new int[] {row, col});
            }
        }
        HashMap<String, Integer> movements=new HashMap<>();
        int ans=0;
        for(int[] source:image1){
            for(int[] target:image2){
               String paths = (target[0]-source[0])+ ","+ (target[1]- source[1]);
               movements.put(paths,movements.getOrDefault(paths,0)+1);
               ans=Math.max(ans,movements.get(paths));
            }
        }
        return ans;
    }
}