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
    private static TreeNode merge(TreeNode r1,TreeNode r2){
        if(r1==null&& r2==null) return null;
        if(r1==null&& r2!=null) return r2;
        if(r1!=null && r2==null) return r1;

        TreeNode s1=new TreeNode(r1.val+r2.val);
            s1.left=merge(r1.left,r2.left);
            s1.right=merge(r1.right,r2.right);
            return s1;
        
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
         return merge(root1,root2);
        
    }
}