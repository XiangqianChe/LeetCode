/**
 * 给出运动员各不相同的成绩数组，给出其相应的名次数组
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L0506_RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int len = score.length;
        // 复制原数组用于排序
        int[] temp = Arrays.copyOf(score, len);
        Arrays.sort(temp);
        // 将所有成绩与对应名次放入Map中，前三名名次改为奖项
        Map<Integer, String> ranks = new HashMap<>();
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                ranks.put(temp[i], "Gold Medal");
            } else if (i == len - 2) {
                ranks.put(temp[i], "Silver Medal");
            } else if (i == len - 3) {
                ranks.put(temp[i], "Bronze Medal");
            } else {
                ranks.put(temp[i], len - i + "");
            }
        }
        // 根据原数组成绩依次取出名次
        String[] ret = new String[len];
        for (int i = 0; i < len; i++) {
            ret[i] = ranks.get(score[i]);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
