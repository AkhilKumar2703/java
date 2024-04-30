class Solution {
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

}
// we can also do it without tail if we we want the linked list as a hole
// but we will need make insert function for that