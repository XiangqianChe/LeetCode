/**
 * 一组单词的排列情况是否符合某种模式
 * 如cat dog dog cat符合abba，而cat cat cat cat不符合abba
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class L0290_WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false; // 长度不同，必然不匹配
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            // 将单词与模式字符分别作为键、坐标作为值用put插入map，返回值为键上一次插入的值
            // 如果不相同，说明同一个单词对应了不同字符，或同一个字符对应了不同单词，否则一定同步改变
            if (!Objects.equals(map.put(words[i], i), map.put(pattern.charAt(i) + "", i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "aaaa", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
