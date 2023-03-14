/**
 * 给一串字符，能组合的最长回文结构有多长
 */
import java.util.HashSet;
import java.util.Set;

public class L0409_LongestPalindrome {
    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) { // 成单加入
                set.add(c);
            } else { // 成双取出并记一对
                set.remove(c);
                count++;
            }
        }
        // 回文结构左右对称，而中间可以多1个单，如果有多余的单则加上
        return set.isEmpty() ? count * 2 : count * 2 + 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
