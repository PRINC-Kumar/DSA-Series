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
    int maxcount=0;
    int count=0;
    List<Integer> l1=new ArrayList<>();
    Integer prev= null;
    
    public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        hasvalue(root.val);
        inorder(root.right);
        return;

    }
    public void hasvalue(int val){
        if(prev==null|| prev!=val){
            count =1;
        }
        else{
            count++;
        }
        if(count>maxcount){
            maxcount=count;
            l1.clear();
            l1.add(val);
        }
        else if(count==maxcount){
            l1.add(val);
        }
        prev=val;

    }
    public int[] findMode(TreeNode root) { 
        inorder(root);
        int arr[]=new int[l1.size()];


        for(int i=0;i<l1.size();i++){
            arr[i]=l1.get(i);
        }
        
        return arr;

       
    }
}