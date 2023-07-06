/**
 * 求二叉查找树中所有元素差值中的最小值的绝对值
 */
public class L0530_MinimumAbsoluteDifferenceInBST {
    private static int minDiff = Integer.MAX_VALUE;
    private static TreeNode prev;
    public static int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    // 中序遍历：左节点->根节点->右节点，二叉查找树的当前节点一定>=前一节点，因此逐个求差值并比较较小值即可
    private static void inorder(TreeNode curr) {
        if (curr == null) return;
        inorder(curr.left);
        if (prev != null) minDiff = Math.min(minDiff, curr.val - prev.val);
        prev = curr;
        inorder(curr.right);
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(getMinimumDifference(root));
    }
}
