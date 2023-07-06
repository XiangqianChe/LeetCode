/**
 * 给出整数k，字符串以每2k个字符为单位，将其中前k个字符反转，最后如果不足k个也反转
 */
public class L0541_ReverseStringII {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) { // 以2k为单位
            // 将2k中的前k个左右互换
            for (int left = i, right = Math.min(i + k - 1, s.length() - 1); left < right; left++, right--) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
}
