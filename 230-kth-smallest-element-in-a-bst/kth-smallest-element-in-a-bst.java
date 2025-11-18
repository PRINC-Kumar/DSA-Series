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

   
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        Stack<TreeNode> s1=new Stack<>();
         TreeNode curr=root;
        s1.push(curr);
        while(curr!=null || !s1.isEmpty()){

            while(curr!=null){
                s1.push(curr);
                curr=curr.left;
            }
            curr=s1.pop();
            k--;
            if(k==0) return curr.val;
            curr=curr.right;    
        }
        return -1;  
    }
}