/**
 * 十进制转十六进制
 */
public class L0405_ConvertANumberToHexadecimal {
    public static String toHex(int num) {
        char[] digits = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String hex = "";
        while (num != 0) {
            hex = digits[num & 15] + hex; // 提取num后4位转化为十六进制
            num >>>= 4; // num整体右移4位
        }
        return hex;
    }

    public static void main(String[] args) {
        System.out.println(toHex(26));
    }
}
