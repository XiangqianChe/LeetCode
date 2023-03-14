/**
 * 判断二叉树是否平衡（左右子树高度差不超过1）
 */
public class L0110_BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true; // 节点为空，其父节点是叶子节点，必平衡
        if (Math.abs(depth(root.left) - depth(root.right)) <= 1) { // 深度差不超过1
            return isBalanced(root.left) && isBalanced(root.right); // 继续检查左右子树是否平衡
        }
        return false; // 深度差超过1，不平衡
    }
    // 逐层递归来计算某节点的深度
    private static int depth(TreeNode curr) {
        if (curr == null) return 0;
        return Math.max(depth(curr.left), depth(curr.right)) + 1;
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        System.out.println(isBalanced(root));
    }
}
