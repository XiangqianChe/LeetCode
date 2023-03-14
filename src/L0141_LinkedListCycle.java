/**
 * 判断链表尾部是否指向自己的某一节
 */
public class L0141_LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head; // 创建快慢两个指针
        while (fast != null && fast.next != null) { // 用先到尾部的快指针做判断
            slow = slow.next; // 慢指针一次走一格
            fast = fast.next.next; // 快指针一次走两格
            if (slow == fast) return true; // 快指针能追上慢指针，则成环
        }
        return false;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }
}
