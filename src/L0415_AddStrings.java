/**
 * 求两个非负整数的字符串之和，不得直接将字符转换为数字或使用BigInteger方法
 */
public class L0415_AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        // 两数从后向前依次取数求和
        for (int i=num1.length()-1, j=num2.length()-1; i>=0||j>=0||carry==1; i--, j--) {
            // 如果循环超过某数数位则向前补0
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10; // 将进位带到前一位
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("456","77"));
    }
}
