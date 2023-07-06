/**
 * 求字符串最长的不含重复字符的子串的长度
 */
import java.util.HashMap;
import java.util.Map;

public class L0003_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int begin = 0, end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) { // 若有重复元素，则新起点在被重复的元素之后，并取最大值（务必使之跳过重复段落）
                begin = Math.max(begin, map.get(s.charAt(end)) + 1);
            }
            map.put(s.charAt(end), end); // 将最新的终点与对应坐标依次放入
            max = Math.max(max, end - begin + 1); // 不断求现有子串的最大长度
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbd"));
    }
}
