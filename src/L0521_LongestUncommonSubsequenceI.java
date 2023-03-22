/**
 * 如果一个字符串是a的子串但不是b的子串，这样得到的最长子串就是最长非共有子串LUS
 */
public class L0521_LongestUncommonSubsequenceI {
    public static int findLUSlength(String a, String b) {
        // 两者相同，则没有LUS，两者不同，则长的一方就是LUS
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("aba","cdc"));
        System.out.println(findLUSlength("aaa","bbb"));
        System.out.println(findLUSlength("aaa","aaa"));
    }
}
