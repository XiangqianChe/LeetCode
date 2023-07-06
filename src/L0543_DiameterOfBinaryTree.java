/**
 * 求二叉树的直径（最长路径）
 */
public class L0543_DiameterOfBinaryTree {
    private static int max;
    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root); // 根节点没有上一层，所以无需返回，只需要附带计算max即可
        return max;
    }
    // 一个节点的直径等于其左右子树深度之和，找出所有节点直径的最大值即可
    private static int maxDepth(TreeNode curr) {
        if (curr == null) return 0; // 叶子节点
        int left = maxDepth(curr.left);
        int right = maxDepth(curr.right);
        max = Math.max(max, left + right); // 不断求左右子树深度和的最大值
        return Math.max(left, right) + 1; // 左右深度较大值为当前节点深度，+1得到上一层的节点的左子树或右子树深度
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
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameterOfBinaryTree(root));
    }
}
