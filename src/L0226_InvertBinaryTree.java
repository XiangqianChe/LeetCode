/**
 * 左右反转二叉树
 */
public class L0226_InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // 将左右子树内部交换结果缓存到临时节点left和right中
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // 交换左右子树
        root.left = right;
        root.right = left;
        return root;
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

    private static void printNode(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            printNode(root.left);
            printNode(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        printNode(invertTree(root));
    }
}
