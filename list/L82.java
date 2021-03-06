/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy, cur = head;

        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                int val = cur.val;
                while (cur != null && cur.val == val) cur = cur.next;
            } else {
                pre.next = cur;
                pre = cur;
                cur = cur.next;
                pre.next = null;
            }
        }

        return dummy.next;
    }
}
