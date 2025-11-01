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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null){
            return l1;
        }
        q.offer(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> s1=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                s1.add(q.poll().val);
            }
            l1.add(s1);
        }
        return l1;
    }
}