/**
 * 找出几个单词中能够用qwerty键盘中同一行字母组成的单词
 */
import java.util.Arrays;
import java.util.stream.Stream;

public class L0500_KeyboardRow {
    public static String[] findWords(String[] words) {
        return Stream.of(words) // 字符串数组转成流
                // 每个单词转化成小写，再匹配键盘每一行的正则表达式
                .filter(word -> word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
                .toArray(String[]::new); // 流转成字符串数组
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}
