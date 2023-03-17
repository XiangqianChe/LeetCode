/**
 * 求0和1组成的数组中最长的连续1个数
 */
public class L0485_MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int num : nums) {
            if (num == 1) { // 遇1计数并求最大值
                count++;
                max = Math.max(max, count);
            } else { // 遇0重置
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
