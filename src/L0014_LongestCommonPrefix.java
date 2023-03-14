/**
 * 找出最长的共同前缀
 */
import java.util.Arrays;

public class L0014_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // 排序后首尾两者差异最大，无需比较中间
        Arrays.sort(strs);
        String first = strs[0], last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0,i);
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
