/**
 * 实现数组类，包含求坐标m到n之间（含m和n）数值之和的方法，数组不可更改
 */
public class L0303_RangeSumQuery_Immutable {
    static class NumArray {
        private int[] nums;
        public NumArray(int[] nums) {
            // 在参数数组各坐标上求之前的累积和，再作初始化
            // 这样用于sumRange方法时，可以减少重复计算
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            this.nums = nums;
        }

        public int sumRange(int left, int right) { // 求和范围是包含left和right坐标本身的
            return left == 0 ? this.nums[right] : this.nums[right] - this.nums[left - 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));
        System.out.println(numArray.sumRange(0,5));
    }
}
