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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        if(root==null) return l1;
        s1.push(root);
        while(!s1.isEmpty()){
            root=s1.pop();
            s2.push(root);
            if(root.left!=null) s1.push(root.left);
            if(root.right!=null) s1.push(root.right);
        }
        while(!s2.isEmpty()){
            root=s2.pop();
            l1.add(root.val);
        }
       return l1; 
    }
}