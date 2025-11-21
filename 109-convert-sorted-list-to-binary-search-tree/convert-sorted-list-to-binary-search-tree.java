/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode build(List<Integer> l1,int s,int e){
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        TreeNode root=new TreeNode(l1.get(mid));
        root.left=build(l1,s,mid-1);
        root.right=build(l1,mid+1,e);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        
        List<Integer> l1=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l1.add(temp.val);
            temp=temp.next;
        }
         return build(l1,0,l1.size()-1);
        
    }
}