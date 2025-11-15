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
     private int result=0;
    public int build(TreeNode root){
        if(root==null) return 0;
        int left=build(root.left);
        int right=build(root.right);
        result+=Math.abs(left-right);
        return left+right+root.val;

    }
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
       build(root);
       return result;

        
    }
}