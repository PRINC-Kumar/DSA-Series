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
    public ListNode sortList(ListNode head) {
        List<Integer> s1=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            s1.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(s1);
        temp=head;
        int i=0;
       while(temp!=null){
        temp.val=s1.get(i++);
        temp=temp.next;
       }
       return head;
    
    }
}