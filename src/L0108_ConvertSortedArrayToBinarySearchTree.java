/**
 * 将有序数组转化为二叉查找树
 */
public class L0108_ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private static TreeNode helper(int[] nums, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            TreeNode curr = new TreeNode(nums[mid]); // 将中值并放入节点
            curr.left = helper(nums, start, mid - 1); // 寻找原中值左侧的新中值，并接入
            curr.right = helper(nums, mid + 1, end); // 寻找原中值右侧的新中值，并接入
            return curr;
        }
        return null; // 空数组
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

    private static void printTree(TreeNode root) {
        if (root == null) return; // 根节点为null时，直接结束
        if (root.left != null) { // 打印存在的左子节点
            System.out.println(root.left.val);
        }
        if (root.right != null) { // 打印存在的左子节点
            System.out.println(root.right.val);
        }
        if (root.left != null) { // 打印存在的左子节点的下一层
            printTree(root.left);
        }
        if (root.right != null) {// 打印存在的右子节点的下一层
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        TreeNode BST = sortedArrayToBST(nums);
        if (BST != null) {
            System.out.println(BST.val); // 打印根节点
        } else {
            System.out.println("null");
        }
        printTree(BST); // 打印其余节点
    }
}
