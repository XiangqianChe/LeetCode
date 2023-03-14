/**
 * 判断字符串是否为回文结构
 */
public class L0125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1; // 两个指针分别从左右遍历
        while (left < right) { // 不需要等于，最中间的一个字符自身就是回文
            while (!Character.isLetterOrDigit(s.charAt(left))) left++; // 从前遇到其他字符，一直跳过
            while (!Character.isLetterOrDigit(s.charAt(right))) right--; // 从后遇到其他字符，一直跳过
            if (Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--)))
                return false; // 一组不相同就false
        }
        return true; // 组组相同才true
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
