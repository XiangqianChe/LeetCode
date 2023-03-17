public class L0482_LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') { // 跳过原字符串中的“-”
                // 在当前字符串上反向依次拼接原字符串的字符，每k个就要先拼接“-”凑成长度为k+1的一组
                sb.append(sb.length() % (k + 1) != k ? "" : "-").append(s.charAt(i));
            }
        }
        return sb.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J",2));
    }
}
