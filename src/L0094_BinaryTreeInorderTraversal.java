/**
 * 二叉树中序遍历：左子树->根节点->右子树（根节点在中）
 */
import java.util.ArrayList;
import java.util.List;

public class L0094_BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>(); // 创建唯一的列表用于输出
        helper(root, list); // 创建以该列表为参数的工具方法进行递归（如果用原方法递归，数值会分别插入新创建的多个列表中）
        return list;
    }

    private static void helper(TreeNode root, List<Integer> list) {
        if (root != null) {
            helper(root.left, list); // 先遍历左子树
            list.add(root.val); // 在列表中插入当前节点的数值
            helper(root.right, list); // 后遍历右子树
        }
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
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root));
    }
}
