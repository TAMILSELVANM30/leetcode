// Last updated: 7/7/2026, 10:25:21 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1,t2);
            
    }
    public TreeNode merge(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null){
            return null;
        }if(t1==null&& t2!=null){
            return t2;
        }if(t1!=null && t2==null){
            return t1;
        }
        TreeNode ans=new TreeNode(t1.val+t2.val);
        ans.left=merge(t1.left,t2.left);
        ans.right=merge(t1.right,t2.right);
        return ans;
    }
}