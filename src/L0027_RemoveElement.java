import java.util.Arrays;

/**
 * 去除数组中某一数值的元素
 */
public class L0027_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i]; // 统计不等于该数值的元素数量并向前置换
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }
}
