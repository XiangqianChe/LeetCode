/**
 * 有序单链表去重
 */
public class L0083_RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null && list.next != null) {
            if (list.val == list.next.val) { // list与next值相同则顺延next
                list.next = list.next.next;
            } else { // list与next值不同则顺延list
                list = list.next;
            }
        }
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode noDuplicatesList = deleteDuplicates(head);
        while (noDuplicatesList != null) {
            System.out.println(noDuplicatesList.val);
            noDuplicatesList = noDuplicatesList.next;
        }
    }
}
