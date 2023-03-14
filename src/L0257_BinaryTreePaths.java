/**
 * 记录二叉树从根到叶的全部路径
 */
import java.util.LinkedList;
import java.util.List;

public class L0257_BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();
        if(root != null) helper(root, "", paths);
        return paths;
    }

    private static void helper(TreeNode root, String path, List<String> paths) {
        // 左子树存在，记录本节点后进入左子树
        if (root.left != null) helper(root.left, path + root.val + "->", paths);
        // 右子树存在，记录本节点后进入右子树
        if (root.right != null) helper(root.right, path + root.val + "->" ,paths);
        // 到达叶子节点，路径结束，记入路径列表
        if (root.left == null && root.right == null) paths.add(path + root.val);
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
        System.out.println(binaryTreePaths(root));
    }
}
