/**
 * 找出众数（假设众数必存在且数量超过一半）
 */
public class L0169_MajorityElement {
    public static int majorityElement(int[] nums) {
        int major = 0, count = 0;
        for (int num : nums) {
            if (count == 0) { // 平则起势
                major = num;
                count++;
            } else if (num == major) { // 同则增势
                count++;
            } else { // 异则减势
                count--;
            }
        }
        return major; // 势存为众
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,1,1,2};
        System.out.println(majorityElement(nums));
    }
}
