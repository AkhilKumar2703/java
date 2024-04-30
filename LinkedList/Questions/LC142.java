package LinkedList.Questions;

public public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lenghtCycle(slow);
                break;
            }

        }
        if (length == 0) {
            return null;
        }

        // now we will make s and f
        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;

        }
        // now where f and s meet id our ans K
        while (f != s) {
            f = f.next;
            s = s.next;

        }
        return s;
    }

    // this function gives us the length of the cycle
    public int lenghtCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int length = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;

                } while (temp != slow);
                return length;
            }

        }
        return 0;
    }
}
