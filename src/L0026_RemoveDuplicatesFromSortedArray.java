/**
 * 有序数组去重
 */
import java.util.Arrays;

public class L0026_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) { // 统计重复元素数量
                count++;
            } else {
                nums[i - count] = nums[i]; // 将不重复元素向前置换
            }
        }
        return nums.length - count; // 得到不重复元素的数量
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
