/**
 * 求所有左叶子节点之和
 */
public class L0404_SumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0; // 没有子节点，结束迭代
        int ret = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            ret += root.left.val; // 左叶子节点的条件
        }
        ret += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right); // 不符合则向其左右子树继续迭代
        return ret;
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));
    }
}


