/**
 * 判断数组的一定范围中是否有重复元素
 */
import java.util.HashSet;
import java.util.Set;

public class L0219_ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> distinct = new HashSet<>(); // Set无法包含重复元素
        for (int i = 0; i < nums.length; i++) {
            if (i > k) distinct.remove(nums[i - k - 1]); // 删除i-k之前的所有元素（已超出k的范围）
            if (!distinct.add(nums[i])) return true; // add失败，说明Set中已add过该元素，即数组中该元素有多个
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums, 3));
    }
}
