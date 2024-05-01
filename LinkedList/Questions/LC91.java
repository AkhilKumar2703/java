class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        // skip it till left -1
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode end = current;
        // reverse th left and right now
        ListNode next = current.next;
        for (int i = 0; i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }

        }
        // ending nodes
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        end.next = current;
        return head;
    }
}