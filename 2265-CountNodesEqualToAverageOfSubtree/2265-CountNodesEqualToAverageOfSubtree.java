// Last updated: 9/14/2026, 11:55:14 PM

class Solution {
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        int[] ans=answer(root);
        return count;
    }
    public int[] answer(TreeNode root){//{total,n} n is the count
        if(root==null) return new int[] {0,0};         
        int[] left=answer(root.left);
        int[] right=answer(root.right);
        int n = left[1]+right[1]+1;
        int total=left[0]+right[0]+root.val;
        int average=total/n;
        if(average==root.val)  count++;
        return new int[] {total,n};
    }
   
}
