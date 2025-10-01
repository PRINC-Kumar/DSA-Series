/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        HashMap<Node,Node> s1=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node p1=new Node(temp.val);
            s1.put(temp,p1);
            temp=temp.next;
        }
        Node temp1=head;
        while(temp1!=null){
            Node copy=s1.get(temp1);
            copy.next=s1.get(temp1.next);
            copy.random=s1.get(temp1.random);
            temp1=temp1.next;

        }

    return s1.get(head);
     
    }
}