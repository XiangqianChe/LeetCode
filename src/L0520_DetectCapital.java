/**
 * 单词或者全大写，后者全小写，或者首字母大写，否则不正确
 */
public class L0520_DetectCapital {
    public static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+"); // +代表1到多，*代表0到多
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("Flag"));
        System.out.println(detectCapitalUse("FlaG"));
    }
}
