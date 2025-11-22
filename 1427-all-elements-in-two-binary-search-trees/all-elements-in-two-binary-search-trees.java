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
  PriorityQueue<Integer> pq = new PriorityQueue<>();

    public void add(TreeNode root1){
        if(root1==null){
            return;
        }
        add(root1.left);
        pq.add(root1.val);
        add(root1.right);
        return;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        add(root1);
        add(root2);
        List<Integer> l1=new ArrayList<>();
        int n=pq.size();
        for(int i=0;i<n;i++){
            l1.add(pq.poll());
        }
        return l1;


        
    }
}