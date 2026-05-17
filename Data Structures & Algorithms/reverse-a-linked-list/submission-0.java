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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode temp = head;
        ListNode after = null;
        while(temp != null) {
            after = temp.next;
            temp.next = previous;
            previous = temp;
            temp = after;
        }
        return previous;
    }
}
