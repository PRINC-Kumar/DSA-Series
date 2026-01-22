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
       static  int c1=0;
    public static int count(TreeNode root){
        if(root==null) return 0;

        int left=count(root.left);
        int right =count(root.right);
          
          c1 += Math.abs(left)+Math.abs(right);
          return root.val+left+right-1;

    }
    public int distributeCoins(TreeNode root) {
        c1=0;

       count(root);
      return c1;
        
    }
}