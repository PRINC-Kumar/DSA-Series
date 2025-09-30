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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> s1=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            s1.push(temp);
            temp=temp.next;
        }
        ListNode newlist=s1.pop();
        int max=newlist.val;
        while(!s1.isEmpty()){
             ListNode curr=s1.pop();
            if(curr.val<max){
                continue;
            }
            else{
                curr.next=newlist;
                newlist=curr;
                max=curr.val;
            }
            

        }
        return newlist;
    }
}