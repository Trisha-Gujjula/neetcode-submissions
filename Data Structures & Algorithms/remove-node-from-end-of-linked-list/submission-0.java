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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;
        ListNode temp = head;
        
        int count = 0;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        int position = count -n ;

        for(int i=0;i<position;i++){
            current=current.next;
        }

        current.next=current.next.next;

        return dummy.next;

    }
}
