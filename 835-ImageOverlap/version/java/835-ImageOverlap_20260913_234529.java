// Last updated: 9/13/2026, 11:45:29 PM
1class Solution {
2    public int largestOverlap(int[][] img1, int[][] img2) {
3        List<int[]>image1=new ArrayList<>();
4        List<int[]>image2=new ArrayList<>();
5        int n=img1.length;
6        for(int row=0;row<n;row++){
7            for(int col=0;col<n;col++){
8                if(img1[row][col]==1) image1.add(new int[] {row,col});
9                if(img2[row][col]==1) image2.add(new int[] {row, col});
10            }
11        }
12        HashMap<String, Integer> movements=new HashMap<>();
13        int ans=0;
14        for(int[] source:image1){
15            for(int[] target:image2){
16               String paths = (target[0]-source[0])+ ","+ (target[1]- source[1]);
17               movements.put(paths,movements.getOrDefault(paths,0)+1);
18               ans=Math.max(ans,movements.get(paths));
19            }
20        }
21        return ans;
22    }
23}