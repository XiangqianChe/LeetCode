/**
 * 将有序列表转化为二叉查找树
 */
public class L0109_ConvertSortedListToBinarySearchTree {
    public static TreeNode sortedListToBST(ListNode head) {
        return helper(head, null);
    }

    private static TreeNode helper(ListNode start, ListNode end) {
        if (start == end) return null;
        ListNode slow = start, fast = start; // 设置快慢两个指针从起点同时出发
        // 当循环结束时，快指针走到终点，慢指针走到一半（成为中值）
        while (fast != end && fast.next != end) { // start至end的元素数量为单数时的结束条件 && 为双数时的结束条件
            slow = slow.next; // 慢指针每次走一步
            fast = fast.next.next; // 快指针每次走两步
        }
        TreeNode curr = new TreeNode(slow.val); // 将中值并放入节点
        curr.left = helper(start, slow); // 寻找原中值左侧的新中值，并接入
        curr.right = helper(slow.next, end); // 寻找原中值右侧的新中值，并接入
        return curr;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static void printTree(TreeNode root) {
        if (root == null) return; // 根节点为null时，直接结束
        if (root.left != null) { // 打印存在的左子节点
            System.out.println(root.left.val);
        }
        if (root.right != null) { // 打印存在的左子节点
            System.out.println(root.right.val);
        }
        if (root.left != null) { // 打印存在的左子节点的下一层
            printTree(root.left);
        }
        if (root.right != null) {// 打印存在的右子节点的下一层
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        TreeNode BST = sortedListToBST(head);
        if (BST != null) {
            System.out.println(BST.val); // 打印根节点
        } else {
            System.out.println("null");
        }
        printTree(BST); // 打印其余节点
    }
}
