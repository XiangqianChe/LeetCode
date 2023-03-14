/**
 * 除一个数之外，数组包含从0到n所有整数，请找出它
 */
public class L0268_MissingNumber {
    public static int missingNumber(int[] nums) {
        // 数组本应包含从0到n，共n+1个数，但现在只有其中n个
        // 将数组本应包含的n+1个数与实际包含的n个数求异或，剩下的结果就是缺少的数
        int ret = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ret ^= i;
            ret ^= nums[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}

