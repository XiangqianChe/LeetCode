/**
 * 判断树是否左右对称
 */
public class L0101_SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right; // 同时为空，对称；一个为空，一个不为空，不对称
        if (left.val != right.val) return false; // 都不为空，值不相等，不对称
        return helper(left.left, right.right) && helper(left.right, right.left); // 分别比较左子树的左、右子树的右，以及左子树的右、右子树的左
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
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(3);
        System.out.println(isSymmetric(tree));
    }
}
