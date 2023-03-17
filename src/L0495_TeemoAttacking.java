/**
 * 提莫对艾希用毒，给出用毒的时间数组和单次中毒时长，求中毒总时长
 */
public class L0495_TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            // 两次用毒时间过于接近，小于duration时，只需加上其时差，否则应加上完整的duration
            sum += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
        }
        return sum + duration; // 最后一次用毒不受其他用毒影响，直接加完整的duration（也适用于只有一次用毒的情况）
    }

    public static void main(String[] args) {
        int[] timeSeries = {1,2};
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries, duration));
    }
}
