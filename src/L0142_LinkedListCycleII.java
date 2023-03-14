public class L0142_LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head; // 创建快慢两个指针
        while (fast != null && fast.next != null) { // 用先到尾部的快指针做判断
            slow = slow.next; // 慢指针一次走一格
            fast = fast.next.next; // 快指针一次走两格
            // 假设起点到循环开始节点的距离为A
            // 当快指针追上慢指针时，慢指针又走过的距离为B
            // 慢指针总共走了A+B，快指针总共走了2A+2B，相差的A+B为快指针多走的距离，为循环的长度的倍数
            // 此时慢指针距离循环起点的距离为B，如果再走A必能到达循环起点
            // 因此只需让另一个指针从起点以慢指针的速度和此时的慢指针一起出发，在走过距离A后必会在循环起点相遇
            if (slow == fast) {
                ListNode helper = head;
                while (helper != slow) {
                    helper = helper.next;
                    slow = slow.next;
                }
                return helper;
            }
        }
        return null;
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
        ListNode ret = detectCycle(head);
        System.out.println(ret != null ? ret.val : null);
    }
}
