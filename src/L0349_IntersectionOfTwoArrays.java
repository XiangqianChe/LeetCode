/**
 * 找出两个数组中的相同元素（去重）
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L0349_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(); // 将array1转入set1
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> intersect = new HashSet<>(); // 找出set1和array2的相同元素转入set_intersect
        for (int j : nums2) {
            if (set1.contains(j)) {
                intersect.add(j);
            }
        }
        int[] res = new int[intersect.size()]; // 将set_intersect转入array_res
        int k = 0;
        for (Integer num : intersect) {
            res[k++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
