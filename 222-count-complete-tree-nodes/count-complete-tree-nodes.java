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
    private int heightleft(TreeNode node){
        int count=0;
        while(node!=null){
            count++;
            node=node.left;
        }
        return count;

    }
     private int heightright(TreeNode node){
        int count=0;
        while(node!=null){
            count++;
            node=node.right;
        }
        return count;

    }
    public int countNodes(TreeNode root) {
        if( root==null) return 0;

        int left=heightleft(root);
        int right=heightright(root);

        if(left==right) return ((1<<left)-1);
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
        
    }
}