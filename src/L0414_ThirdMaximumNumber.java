/**
 * 找出数组中去重后第三大的数字，如果没有就找出最大值
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class L0414_ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        for (int num : nums) {
            set.add(num); // 都加入Set可去重
        }
        if (set.size() >= 3) { // 数量大于3就去掉前2
            set.remove(Collections.max(set));
            set.remove(Collections.max(set));
        }
        return Collections.max(set);
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
}
