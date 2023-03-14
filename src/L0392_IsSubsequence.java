/**
 * 判断字符串t是否包含字符串s的按照顺序的所有字符
 */
public class L0392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) { // s为空字符串，t必包含s
            return true;
        }
        // s和t两个指针依次比较
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            if (j == s.length()) return true; // 比到s结束，包含
        }
        return false; // 否则不包含
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
}
