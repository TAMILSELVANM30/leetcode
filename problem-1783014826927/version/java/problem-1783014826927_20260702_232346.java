// Last updated: 7/2/2026, 11:23:46 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
18        return merge(t1,t2);
19            
20    }
21    public TreeNode merge(TreeNode t1,TreeNode t2){
22        if(t1==null && t2==null){
23            return null;
24        }if(t1==null&& t2!=null){
25            return t2;
26        }if(t1!=null && t2==null){
27            return t1;
28        }
29        TreeNode ans=new TreeNode(t1.val+t2.val);
30        ans.left=merge(t1.left,t2.left);
31        ans.right=merge(t1.right,t2.right);
32        return ans;
33    }
34}