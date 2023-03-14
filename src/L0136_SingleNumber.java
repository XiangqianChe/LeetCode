/**
 * 找出成双的数中唯一落单的
 */
public class L0136_SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num; // 逐次异或
        }
        return ans; // 余者为单
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }
}
