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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        
         TreeNode node=root;
        while(true){
            if(node!=null){
                s1.push(node);
                node=node.left;
            }
            else{
                if(s1.isEmpty()){
                    break;
                }
                node=s1.pop();
                l1.add(node.val);
                node=node.right;
            }
        }
        return l1;
    }
}