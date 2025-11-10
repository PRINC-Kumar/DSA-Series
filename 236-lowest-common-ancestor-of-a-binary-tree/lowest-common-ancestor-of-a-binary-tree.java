/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null|| p==root||q==root){
            return root;
        }
        TreeNode nodeleft=lowestCommonAncestor(root.left,p,q);
        TreeNode noderight=lowestCommonAncestor(root.right,p,q);

        if(nodeleft==null){
            return noderight;
        }
        else if(noderight==null){
            return nodeleft;
        }
        else{
            return root;
        }
        
    }
}