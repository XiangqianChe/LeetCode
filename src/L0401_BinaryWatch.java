/**
 * 一块以二进制倍数显示时分的表如下
 * H    8   4   2   1
 * M    32  16  8   4   2   1
 * 已知亮起的数字个数，求可能的时间组合（时不能有前置0，分必须有前置0）
 */
import java.util.ArrayList;
import java.util.List;

public class L0401_BinaryWatch {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) { // 时的范围
            for (int m = 0; m < 60; m++) { // 分的范围
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) { // 两者二进制中1之和等于亮起数即可
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return times;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }
}
