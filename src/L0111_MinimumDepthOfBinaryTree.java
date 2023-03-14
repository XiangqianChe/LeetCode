/**
 * 求二叉树的最小深度
 */
public class L0111_MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0; // 节点不存在，加0层
        // 节点存在，加1层（本层）
        // 没有左节点（右节点）时，看右节点（左节点）的最小深度
        // 左右节点都存在时，比较两者中的较大深度
        int L = minDepth(root.left), R = minDepth(root.right);
        return (root.left == null || root.right == null) ?
                Math.max(L, R) + 1 : Math.min(L, R) + 1;
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
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        System.out.println(minDepth(root));
    }
}
