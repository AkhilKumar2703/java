public class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode tail = ans;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        while (list1 != null) {
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while (list2 != null) {
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }
        return ans.next;
    }

    public ListNode middleNode(ListNode head) {

        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        return s;

    }

}