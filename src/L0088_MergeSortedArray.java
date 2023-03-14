/**
 * 将第二个数组有序合并到第一个数组中
 */
import java.util.Arrays;

public class L0088_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1长度为m+n，其中前m项为需要被合并的项，后n项是为nums2中各项预留的空间
        // nums2长度为n
        int i = m - 1, j = n - 1, k = m + n - 1;
        // 倒序依次比较后，倒序放入nums1
        while (i >= 0 && j >= 0) {
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        // 如果比较结束nums1仍有剩余，则无需改变；如果比较结束nums2仍有剩余，倒序依次放入nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {1,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
