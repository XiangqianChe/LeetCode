/**
 * 将字符数组反转
 */
import java.util.Arrays;

public class L0344_ReverseString {
    public static void reverseString(char[] s) {
        // 头尾两指针依次互换
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
    }

    public static void main(String[] args) {
        char[] s = {'H','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
