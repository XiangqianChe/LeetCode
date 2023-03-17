/**
 * 对不重复数组1中的每个元素，找出不重复数组2中与之相等的元素(必存在)并返回它之后第一个更大的元素，如果没有就返回-1
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class L0496_NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>(); // 将nums2中每个元素与其下一个较大元素存为键值对
        for (int num : nums2) {
            while (!stack.empty() && num > stack.peek()) { // 栈中元素有下一个较大元素
                map.put(stack.pop(), num); // 出栈并存入map
            }
            stack.push(num); // 栈中存入未找到下一个较大元素的元素
        }
        int[] ret = new int[nums1.length];
        int i = 0;
        for (int num : nums1) { // 给nums1中每个元素找其在map中相同元素的下一个较大元素，没有就返回-1
            ret[i++] = map.getOrDefault(num, -1);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
