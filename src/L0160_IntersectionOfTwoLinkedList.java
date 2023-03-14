/**
 * 两个链表后端重合，找出重合节点
 */
public class L0160_IntersectionOfTwoLinkedList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null; // 有链表为空，重合无从谈起
        ListNode a = headA, b = headB;
        while (a != b) { // 循环直到重合，或同时结束（不重合）
            // 两个指针同时向后遍历并比较，如果一个链表结束就连到另一个的起始
            // 两者都连到对方的起始后，距离交点的距离必定相同，继续向后遍历直到重合即可
            // 如此可以在不计算两个链表长度的情况下，解决其长度不同的问题
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        return a; // 重合时，返回
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
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        ListNode intersection = new ListNode(8);
        headA.next.next = intersection;
        headB.next.next.next = intersection;
        intersection.next = new ListNode(8);
        intersection.next.next = new ListNode(4);
        intersection.next.next.next = new ListNode(5);
        System.out.println(getIntersectionNode(headA, headB) == intersection);
    }
}
