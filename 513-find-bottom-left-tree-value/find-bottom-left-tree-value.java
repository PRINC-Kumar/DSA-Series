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
    int level=-1;
    int ans=0;
    public void  findvalue(TreeNode root,int l1){
        if(root==null){
            return;
        }
        if( l1>level){
            level=l1;
            ans=root.val;
        }
        findvalue(root.left,l1+1);
        findvalue(root.right,l1+1);
        return ;
    }
    public int findBottomLeftValue(TreeNode root) {

        findvalue(root,0);
        return ans;
        
    }
}