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
class Solution {
      private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
      }
    
    public void reorderList(ListNode head) {
        if(head==null|| head.next==null){
            return ;
        }
    
        ListNode temp=head;
        ListNode temp2=head;
        while(temp2!=null&&temp2.next!=null){
            temp=temp.next;
            temp2=temp2.next.next;

        }
        ListNode secondlist=reverse(temp.next);
        temp.next=null;
        ListNode firstlist=head;
        while(secondlist!=null){
            ListNode firstnext=firstlist.next;
            ListNode secondnext=secondlist.next;

            firstlist.next=secondlist;
            secondlist.next=firstnext;

            firstlist=firstnext;
            secondlist=secondnext;
        }
      return;
    }
}