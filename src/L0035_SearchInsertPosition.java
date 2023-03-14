/**
 * 在有序数组中寻找某一数值的坐标，如不存在则寻找其插入后应位于的坐标
 */
public class L0035_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        // 通过取中值不断逼近
        int low = 0, high = nums.length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target <= nums[mid]) { // 等号可用于去重
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // 最后low与high相等时，若目标小于等于该值则返回其坐标，大于该值则返回其+1坐标
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
}
