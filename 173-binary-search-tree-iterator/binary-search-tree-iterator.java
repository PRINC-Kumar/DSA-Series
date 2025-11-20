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
class BSTIterator {
    Stack<TreeNode > s1=new Stack<>();
      public void pushleft(TreeNode root){
        while(root!=null){
            s1.push(root);
            root=root.left;
        }
        return;
    }

    public BSTIterator(TreeNode root) {
        pushleft(root);
       
    }
      public int next() {
        TreeNode node =s1.pop();
        if(node.right!=null){
            pushleft(node.right);
        }
        return node.val;   
    }
     public boolean hasNext() {
        return !s1.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */