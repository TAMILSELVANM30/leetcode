// Last updated: 9/10/2026, 5:24:19 PM
1
2class Solution {
3    int count=0;
4    public int averageOfSubtree(TreeNode root) {
5        int[] ans=answer(root);
6        return count;
7    }
8    public int[] answer(TreeNode root){//{total,n} n is the count
9        if(root==null) return new int[] {0,0};         
10        int[] left=answer(root.left);
11        int[] right=answer(root.right);
12        int n = left[1]+right[1]+1;
13        int total=left[0]+right[0]+root.val;
14        int average=total/n;
15        if(average==root.val)  count++;
16        return new int[] {total,n};
17    }
18   
19}
20