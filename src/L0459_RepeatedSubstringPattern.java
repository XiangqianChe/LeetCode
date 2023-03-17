/**
 * 判断字符串是否是它子串的重复
 */
public class L0459_RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--) {
            // 从一半长度的子串递减，如果子串长度能被总长整除且子串重复后与原字符串相同，即为真
            if (len % i == 0 && s.substring(0, i).repeat(len / i).equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababab"));
    }
}
