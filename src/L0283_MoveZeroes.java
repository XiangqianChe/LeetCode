/**
 * 将数组中的非0元素移到0前方，且顺序不变
 */
import java.util.Arrays;

public class L0283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int firstZero = 0; // 第一个0的坐标，假设处于0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // 如果不为0，赋值到firstZero处，firstZero坐标+1
                nums[firstZero++] = nums[i];
            }
        }
        while (firstZero < nums.length) { // 所有不为0的数都已赋值到前方，将之后都赋值为0
            nums[firstZero++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
