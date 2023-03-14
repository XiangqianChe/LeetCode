/**
 * 长度为n的数组中应包含1到n每个数字，但其中有几个被换成了其他的（还在1到n范围内），请找出缺少的数字
 */
import java.util.ArrayList;
import java.util.List;

public class L0448_FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) { // 将当前位置的数换到它在正序排列中应该存在的位置
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) { // 当数值与所在位置不匹配时，记录位置
                disappeared.add(i + 1);
            }
        }
        return disappeared;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> disappeared = findDisappearedNumbers(nums);
        System.out.println(disappeared);
    }
}
