/**
 * 找到二叉查找树的模（最常见元素），二叉查找树的左节点<=根节点<=右节点
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L0501_FindModeInBinarySearchTree {
    // 各方法公用的数据设为全局
    private static Integer prev = null; // 上一层节点的数值，用于比较与本节点是否一致
    private static int count = 1, max = Integer.MIN_VALUE; // 当前节点上的值的出现次数，以及所有节点上出现最多的值（模）的次数
    private static final List<Integer> modes = new ArrayList<>(); // 用于存放所有模

    public static int[] findMode(TreeNode root) {
        traverse(root);
        // 将列表转为数组
        int[] ret = new int[modes.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = modes.get(i);
        }
        return ret;
    }

    private static void traverse(TreeNode root) {
        if (root == null) return; // 到底则结束
        // 中序遍历：左-根-右，符合二叉查找树的升序规律
        traverse(root.left); // 遍历左子树
        if (prev != null) {
            if (root.val == prev) { // 与父节点相同则累加
                count++;
            } else { // 与父节点不同则重置
                count = 1;
            }
        }
        if (count > max) { // 新模出现，设为模组唯一
            max = count;
            modes.clear();
            modes.add(root.val);
        } else if (count == max) {  // 并列新模出现，加入模组即可
            modes.add(root.val);
        }
        prev = root.val;
        traverse(root.right); // 遍历右子树
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
        System.out.println(Arrays.toString(findMode(root)));
    }
}
