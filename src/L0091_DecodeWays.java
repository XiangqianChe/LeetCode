/**
 * 将包含数字的字符串转化成可能的字母组合,有几种方法
 */
public class L0091_DecodeWays {
    public static int numDecodings(String s) {
        if (s.length() <= 1) return 1; // 只剩0或1个数字，只有1种可能
        int ways = 0;
        if (s.charAt(0) == '0') return 0; // 第0个字母不存在
        // 只可能是字母第3~9，直接跳到后一个
        if (s.charAt(0) >= '3' || (s.charAt(0) == '2' && s.charAt(1) >= '7')) {
            ways += numDecodings(s.substring(1));
        } else { // 可能是字母第1~2或10~26，跳到后一个或两个
            ways += numDecodings(s.substring(1)) + numDecodings(s.substring(2));
        }
        return ways;
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
    }
}
