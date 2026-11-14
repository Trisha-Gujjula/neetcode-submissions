
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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head;
        while(temp1 != null && temp1.next != null){
            temp= temp.next;
            temp1 = temp1.next.next;
            if(temp == temp1){
                return true;
            }
        }
        // HashSet<ListNode> hs = new HashSet<>();
        // while(head != null){
        //     if(hs.contains(head)){
        //         return true;
        //     }else{
        //         hs.add(head);
        //     }
        //     head = head.next;
        // }
        return false;
    }
}
