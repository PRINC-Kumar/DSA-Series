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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
    HashSet<Integer> s1=new HashSet<>();
    for(int i:nums){
        s1.add(i);
    }
      ListNode dummy =new ListNode(0,head);
      ListNode prev=dummy;
      while(prev.next!=null){
        if(s1.contains(prev.next.val)){
            prev.next=prev.next.next;
        }
        else{
            prev=prev.next;
        }
      }  
      return dummy.next;    

    }
}