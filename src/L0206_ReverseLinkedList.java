/**
 * 将一个链表反转
 */
public class L0206_ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null, curr = head;
        while (curr != null) {
            head = curr.next; // 将curr和curr的下一个节点扯断，原head指向curr的下一个节点
            curr.next = newHead; // 断开的curr的下一个节点指向newHead，形成新链表
            newHead = curr; // 这样新链表的head（newHead）应该是curr，如此就完成了一次节点的转移
            curr = head; // 再将curr指向改变了的原head，开始新一轮节点转移
        }
        return newHead;
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
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newHead = reverseList(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
