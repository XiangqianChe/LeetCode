/**
 * 判断两个单词是否为异构词
 */
public class L0242_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26]; // 初始值都为0
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++; // 统计s中的各字母数量
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--; // 反向统计t中的各字母数量
        for (int letter : alphabet) {
            if (letter != 0) return false; // s和t中某字母数量不一样
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
