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

    public int maxPathSum(TreeNode root) {
        int arr[]=new int[1];
        arr[0]=Integer.MIN_VALUE;
        find(root,arr);
        return arr[0];



        
    }
    private int find(TreeNode root,int[] brr){
        if(root==null) return 0;

        int left=Math.max(0,find(root.left,brr));
        int right=Math.max(0,find(root.right,brr));
        brr[0]=Math.max(brr[0],left+right+root.val);
        return root.val+Math.max(left,right);

    }
}