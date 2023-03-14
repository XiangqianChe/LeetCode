/**
 * 表示论文引用次数的整型数组，如果有N篇论文的引用次数都大于等于N，则N的最大值为H指数
 * 数组已按升序排列，时间复杂度需要O(logN)
 */
public class L0275_H_IndexII {
    public static int hIndex(int[] citations) {
        // 时间复杂度需要O(logN)，只能使用分治法
        int len = citations.length;
        int left = 0, right = len - 1, mid, ret = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            // （len - 1） - mid + 1 = len - mid
            if (citations[mid] >= len - mid) { // 中点论文引用次数 >= 中点右边论文数，需要向当前中点左边查找
                ret = len - mid; // 保存临时目标值
                right = mid - 1;
            } else {// citations[mid] < len - mid) 中点论文引用次数 < 中点右边论文数，需要向当前中点右边查找
                left = mid + 1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] citations = {4,5,6,7,8,9};
        System.out.println(hIndex(citations));
    }
}
