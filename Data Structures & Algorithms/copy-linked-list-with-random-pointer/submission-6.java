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

        Node current = head;
        
        if(head == null){
            return null ;
        }

        HashMap<Node,Node> hm = new HashMap<>();

        while(current != null){
            hm.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node copy = hm.get(current);

            copy.next = hm.get(current.next);

            copy.random=hm.get(current.random);

            current = current.next;
        }
        return hm.get(head);
    }
}
