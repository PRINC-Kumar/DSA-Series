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
       HashMap<Integer,Integer> m1=new HashMap<>();
       int maxfreq=0;
    public int  function(TreeNode root){
        if(root==null) return 0;

        int left=function(root.left);
        int right=function(root.right);

         int sum=left+right+root.val;
        m1.put(sum, m1.getOrDefault(sum, 0) + 1);

        maxfreq=Math.max(maxfreq,m1.get(sum));
        return sum;   
    }

    public int[] findFrequentTreeSum(TreeNode root) {
    
        function(root);
        ArrayList<Integer> l1=new ArrayList<>();
        for(int key:m1.keySet()){
            if(m1.get(key)==maxfreq){
                l1.add(key);
            }
        }
        int arr[] =new int [l1.size()];
        for(int i=0;i<l1.size();i++){
            arr[i]=l1.get(i);
        }
        return arr;   
    }
}