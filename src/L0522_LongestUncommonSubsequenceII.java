/**
 * 如果一个字符串是a的子串但不是b的子串，这样得到的最长子串就是最长非共有子串LUS
 * abc是adbec的子串
 */
import java.util.Arrays;

public class L0522_LongestUncommonSubsequenceII {
    public static int findLUSlength(String[] strs) {
        Arrays.sort(strs, (s1, s2) -> // 正序
            s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length()
        );
        for (int i = strs.length - 1; i >= 0; i--) { // 倒着遍历
            if (i > 0 && !strs[i].equals(strs[i - 1]) || i == 0) { // 遇到与前一个相同的跳过
                int j = i + 1;
                for (; j < strs.length; j++) {
                    if (isSubsequence(strs[i], strs[j])) { // 当前字符串如果是其后某一字符串的子串，跳过
                        break;
                    }
                }
                if (j == strs.length) { // 第一次遇到当前字符串不是其后所有字符串的子串，则为答案
                    return strs[i].length();
                }
            }
        }
        return -1;
    }

    private static boolean isSubsequence(String a, String b) { // 判断a是否为b的子串
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == a.length();
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength(new String[] {"ccc","ccc","aa"}));
    }
}
