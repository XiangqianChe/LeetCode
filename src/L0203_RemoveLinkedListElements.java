public class L0203_RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        // 如果下个节点不等于目标值，则指向不变，如果等于目标值，则指向下下个节点
        head.next = removeElements(head.next, val);
        return (head.val == val) ? head.next : head;
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
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        ListNode newHead = removeElements(head,6);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
