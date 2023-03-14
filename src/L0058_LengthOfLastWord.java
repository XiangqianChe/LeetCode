/**
 * 统计字符串中最后一个单词的长度
 */
public class L0058_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else {
                if (len > 0) { // 当遇到最后单词前的空格时
                    return len;
                }
            }
        }
        return len; // 没有单词存在时返回0
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
