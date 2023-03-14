/**
 * 字符串t是将字符串s打乱再添加一个额外字符，找出这个字符
 */
public class L0389_FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char c = 0;
        // 将s和t中字符全部异或，最后剩下额外字符
        for (int i = 0; i < s.length(); i++) {
            c ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            c ^= t.charAt(i);
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","acebd"));
    }
}
