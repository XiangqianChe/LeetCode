/**
 * 判断两个字符串是否同构，如egg和add、paper和title
 */
public class L0205_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        // 字母字符的范围都在0~127内，设立两个128数组，分别记录字符串s和t的字符
        int[] h1 = new int[128], h2 = new int[128]; // 初始值都为0
        for (int i = 0; i < s.length(); i++) {
            // 如果s和t的第i位字符对应位置的值不相同，说明其中一个被设过两次不同的新值
            // 即一个字母对应两个字母，判定为false
            if (h1[s.charAt(i)] != h2[t.charAt(i)]) return false;
            // 分别给s和t的第i位字符对应位置设定初始值0以外的相同新值
            h1[s.charAt(i)] = h2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aa","ab"));
    }
}
