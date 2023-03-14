/**
 * 找出成三的数中唯一落单的
 */
public class L0137_SingleNumberII {
    public static int singleNumber(int[] nums) {
        int ones = 0, twos = 0; // 存放只出现1次和2次的数字
        for (int num : nums) {
            // 将num先用^记录到ones上，再用&~去掉其中出现在twos中的，留下只出现1次的
            ones = (ones ^ num) & ~twos;
            // 将num先用^记录到twos上，再用&~去掉其中出现在ones中的，留下只出现2次的
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,99};
        System.out.println(singleNumber(nums));
    }
}
