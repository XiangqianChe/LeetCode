/**
 * 两数之和
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L0001_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 先查找，后插入；如果先插入，后查找，有可能补数等于自己引起错误
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
