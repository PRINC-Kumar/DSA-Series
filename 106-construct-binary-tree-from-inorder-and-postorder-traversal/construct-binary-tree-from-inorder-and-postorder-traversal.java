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
    public TreeNode build(int[] inorder,int instart, int inend,int[] postorder,int poststart,int postend,Map<Integer,Integer> m1 ){
        if(instart>inend|| poststart>postend) return null;
        
        TreeNode root=new TreeNode(postorder[postend]);
        int inroot=m1.get(postorder[postend]);
        int numleft=inroot-instart;

        root.left=build(inorder,instart,inroot-1,postorder,poststart,poststart+numleft-1,m1);
        root.right=build(inorder,inroot+1,inend,postorder,poststart+numleft,postend-1,m1);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if(inorder.length==0|| postorder.length==0) return null;
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            m1.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,m1);
        
    }
}