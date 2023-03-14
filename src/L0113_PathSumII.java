/**
 * 树的所有从根节点到叶子节点的路径中，找出节点之和等于目标值的所有路径
 */
import java.util.ArrayList;
import java.util.List;

public class L0113_PathSumII {
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ret = new ArrayList<>(); // 用于存放可用路径列表
        List<Integer> curr = new ArrayList<>(); // 用于存放临时路径
        helper(root, targetSum, ret, curr);
        return ret;
    }

    private static void helper(TreeNode root, int targetSum, List<List<Integer>> ret, List<Integer> curr) {
        if (root == null) return; // 直到叶子节点仍无可用路径
        curr.add(root.val); // 将节点加入临时路径，逐步形成潜在的可用路径
        if (root.left == null && root.right == null && targetSum == root.val) {
            ret.add(new ArrayList<>(curr)); // 到叶子节点时存在可用路径，加入可用路径列表
        } else { // 目标值依次减去当前节点值，并进入左右子树继续查找比较
            helper(root.left, targetSum - root.val, ret, curr);
            helper(root.right, targetSum - root.val, ret, curr);
        }
        curr.remove(curr.size() - 1); // 逐步将最后节点移除，最后清空临时路径
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

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
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        List<List<Integer>> ret = pathSum(root, 22);
        System.out.println(ret);
    }
}
