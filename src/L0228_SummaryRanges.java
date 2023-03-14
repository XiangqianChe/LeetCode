/**
 * 升序不重复的数组，输出其中连续数字的范围，如[1,2,4]输出1->2和4
 */
import java.util.ArrayList;
import java.util.List;

public class L0228_SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges  = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) { // 相同就顺延
                i++;
            }
            if (nums[i] != start) { // 首尾不同，输出”首->尾“
                ranges.add(start + "->" + nums[i]);
            } else { // 首尾相同，输出”首“
                ranges.add(start + "");
            }
        }
        return ranges;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> ranges = summaryRanges(nums);
        for (String r : ranges) {
            System.out.println(r);
        }
    }
}
