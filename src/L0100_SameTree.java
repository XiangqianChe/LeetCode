/**
 * 判断两个树是否相同
 */
public class L0100_SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q; // 同时为空，相同；一个为空，一个不为空，不同
        if (p.val != q.val) return false; // 都不为空，值不相等，不同
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // 检查左右子树是否相同
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
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);
        System.out.println(isSameTree(tree1,tree2));
    }

}
