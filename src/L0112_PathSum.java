/**
 * 树的所有从根节点到叶子节点的路径中，是否有路径的节点之和等于目标值
 */
public class L0112_PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false; // 直到叶子节点仍无可用路径
        if (root.left == null && root.right == null && targetSum == root.val) return true; // 到叶子节点时存在可用路径
        // 目标值依次减去当前节点值，并进入左右子树继续查找比较
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
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
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));
    }
}
