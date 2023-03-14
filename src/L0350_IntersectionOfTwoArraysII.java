/**
 * 找出两个数组中的相同元素（不去重）
 */
import java.util.*;

public class L0350_IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>(); // 将array1转入map1
        for (int i : nums1) {
            if (!map1.containsKey(i)) {
                map1.put(i, 1);
            } else {
                map1.put(i, map1.get(i) + 1);
            }
        }
        List<Integer> intersect = new ArrayList<>(); // 找出map1和array2的相同元素转入list_intersect
        for (int j : nums2) {
            if (map1.containsKey(j) && map1.get(j) > 0) {
                intersect.add(j);
                map1.put(j, map1.get(j) - 1);
            }
        }
        int[] res = new int[intersect.size()]; // 将list_intersect转入array_res
        for (int k = 0; k < intersect.size(); k++) {
            res[k] = intersect.get(k);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
