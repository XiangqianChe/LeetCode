public class L0383_RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for (int i = 0; i < magazine.length(); i++) { // 将magazine中字母计数
            alphabet[magazine.charAt(i) - 'a']++;
        }
        for (int j = 0; j < ransomNote.length(); j++) { // 从计数中取出ransomNote用到的字母
            if (--alphabet[ransomNote.charAt(j) - 'a'] < 0) { // 负数说明magazine的字母不够用了
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}
