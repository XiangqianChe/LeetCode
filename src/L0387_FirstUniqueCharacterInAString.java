/**
 * 寻找字符串中第一个不重复字符的坐标
 */
public class L0387_FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) { // 将s中字母计数
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == 1) { // 找出s中第一个数量为1的字母
                return i; // 返回其坐标
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
