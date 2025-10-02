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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode curr = head;

        while (true) {
            // Check if there are at least k nodes left
            ListNode kth = getKth(curr, k);
            if (kth == null) break;

            ListNode nextGroupStart = kth.next;

            // Reverse current group
            ListNode prev = nextGroupStart;
            ListNode node = curr;
            while (node != nextGroupStart) {
                ListNode temp = node.next;
                node.next = prev;
                prev = node;
                node = temp;
            }

            // Connect with previous part
            ListNode temp = prevGroupEnd.next;
            prevGroupEnd.next = kth;
            prevGroupEnd = temp;

            curr = nextGroupStart;
        }

        return dummy.next;
    }

    // Helper: return kth node from current node
    private ListNode getKth(ListNode curr, int k) {
        while (curr != null && k > 1) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
