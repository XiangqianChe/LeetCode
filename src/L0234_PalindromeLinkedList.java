/**
 * 链表是否回文（左右对称）
 */
public class L0234_PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true; // 防止空指针异常
        ListNode slow = head, fast = head; // 通过快慢两个指针找到链表中点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 节点总数为双数时，slow为后半部分第一个节点
        // 节点总数为单数时，slow为中点，此时需要将slow移到中点后一个节点
        // 此时slow代表链表的后半部分（不含中点）
        if (fast != null) slow = slow.next;
        slow = reverse(slow); // 反转后半部分
        while (slow != null) { // 在后半部分的范围内逐个比较
            if (head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    // 链表反转方法
    private static ListNode reverse(ListNode head) {
        ListNode newHead = null, curr;
        while (head != null) {
            curr = head; // 头节点作为当前节点
            head = head.next; // 头节点后移一个，留出单个的当前节点
            curr.next = newHead; // 将当前节点连到新的反转链表的头节点，完成分割
            newHead = curr; // 此时新链表头节点应设为当前节点
        }
        return newHead; // 返回反转后的新链表
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
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}
