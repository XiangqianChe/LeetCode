/**
 * 判断数组中是否有重复元素
 */
import java.util.HashSet;
import java.util.Set;

public class L0217_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinct = new HashSet<>(); // Set无法包含重复元素
        for (int num : nums){
            if (!distinct.add(num)) return true; // add失败，说明Set中已add过该元素，即数组中该元素有多个
        }
        return false; // 全都不重复
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
